package com.karan.shaadidotcom

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.karan.shaadidotcom.daos.AppDatabase
import com.karan.shaadidotcom.model.Profile
import com.karan.shaadidotcom.networking.ProfileService
import com.karan.shaadidotcom.repos.ProfileRepo
import com.karan.shaadidotcom.utils.rethrowIfCancellation
import com.karan.shaadidotcom.utils.withProgress
import kotlinx.coroutines.launch

class MainActivityViewModel(application: Application) : AndroidViewModel(application) {

    val profiles = MutableLiveData<List<Profile>>()
    val errSnackbar = MutableLiveData<String>()
    val loading = MutableLiveData<Boolean>()

    private val profileRepo: ProfileRepo

    init {
        val profileDao = AppDatabase.getDatabase(application).profileDao()
        profileRepo = ProfileRepo(profileDao)
    }

    fun fetchData(maxProfileCount: Int) {
        if (profiles.value != null) {
            // View recreated, data reload not needed
            return
        }

        viewModelScope.launch {
            try {
                withProgress(loading) {
                    kotlin.runCatching {
                        // order maintained to prefer early exit on network call failure
                        val newProfiles = ProfileService.getProfiles(maxProfileCount)

                        val matchStatuses = profileRepo.getWithMatchStatus()
                        newProfiles.forEach { profile ->
                            matchStatuses[profile.uuid]?.also { profile.matchStatus = it }
                        }

                        // Note: Currently not using LiveData from Room itself since it will emit
                        // twice, once on clearing and once on insertion. There are ways to counter
                        // that by adding a delay to emit only the latest state.
                        profileRepo.deleteAll()
                        profileRepo.insertAll(newProfiles)
                        profiles.value = newProfiles
                    }.onFailure {
                        val oldProfiles = profileRepo.getAll()

                        if (oldProfiles.isNotEmpty()) {
                            profiles.value = oldProfiles
                        } else {
                            errSnackbar.value = "No profiles found, please ensure you are connected to the internet"
                        }
                    }
                }
            } catch (t: Throwable) {
                t.rethrowIfCancellation()
                errSnackbar.value = "Unexpected error fetching profiles, please try again"
            }
        }
    }

    suspend fun setStatus(uuid: String, newStatus: Int) {
        // if caller scope is cancelled, this will still update the status in the db
        val job = viewModelScope.launch {
            profileRepo.updateStatus(uuid, newStatus)
        }
        job.join()
    }
}
