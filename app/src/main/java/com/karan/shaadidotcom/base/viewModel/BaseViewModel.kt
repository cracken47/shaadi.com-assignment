package com.toppr.core.base.viewModel

import androidx.annotation.CallSuper
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.Flow
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

abstract class BaseViewModel : ViewModel() {

    // Coroutine Job to handle operations on any particular coroutine scope. This job is cancelled
    // when the ViewModel is destroyed.
    private val jobDelegate = lazy { SupervisorJob() }
    private val job by jobDelegate

    private val isInitialCallMade by lazy { MutableLiveData<Boolean>() }

    private val isScreenInitialCallMade by lazy { MutableLiveData<Map<String, Boolean>>() }

    // Coroutine Scope that can be used to run any operation on the IO thread.
    protected val ioScope by lazy { CoroutineScope(job + Dispatchers.IO) }

    /**
     * This function helps in making an initial API call either from the respective [Fragment]
     * or the [Activity] where the app needs to make an API call for getting the initial data
     * that needs to be set the the [MutableLiveData] objects.
     *
     * This function makes sure that the API call is not made again on screen navigation
     * and orientation changes by making use of [isInitialCallMade] flag, which determines
     * whether the required API call block has been executed at most once.
     */
    fun initialApiCalls(block: (() -> Unit)? = null) {
        block?.let {
            if (isInitialCallMade.value == true) return
            it.invoke()
            isInitialCallMade.postValue(true)
        }
    }

    fun initialScreenApiCall(outerMostChildClassName: String, block: (() -> Unit)? = null) {
        block?.let { apiCall ->
            val stateMap = isScreenInitialCallMade.value?.toMutableMap() ?: mutableMapOf()
            if (stateMap[outerMostChildClassName] == true) return
            apiCall.invoke()
            stateMap[outerMostChildClassName] = true
            isScreenInitialCallMade.postValue(stateMap)
        }
    }

    fun removeScreenApiCallCondition(outerMostChildClassName: String) {
        isScreenInitialCallMade.value?.toMutableMap()?.let { stateMap ->
            stateMap[outerMostChildClassName] = false
            isScreenInitialCallMade.postValue(stateMap)
        }
    }



    @CallSuper
    override fun onCleared() {
        if (jobDelegate.isInitialized()) {
            job.cancel()
        }
        super.onCleared()
    }

}