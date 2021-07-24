package com.karan.shaadidotcom.repo

import com.karan.shaadidotcom.daos.ProfileDao
import com.karan.shaadidotcom.model.Profile

class ProfileRepo(private val profileDao: ProfileDao) {

    suspend fun getAll() = profileDao.getAll()

    suspend fun getWithMatchStatus() = profileDao.getWithMatchStatus()
        .associateBy({ it.uuid }, { it.matchStatus })

    suspend fun updateStatus(uuid: String, newStatus: Int) =
        profileDao.updateStatus(uuid, newStatus)

    suspend fun insertAll(profiles: List<Profile>) = profileDao.insertAll(profiles)

    suspend fun deleteAll() = profileDao.deleteAll()

}
