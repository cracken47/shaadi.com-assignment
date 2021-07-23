package com.karan.shaadidotcom.networking

import com.karan.shaadidotcom.model.Profile

object ProfileService {
    suspend fun getProfiles(maxQuantity: Int) = ApiService.service
        .getProfiles(maxQuantity).results.mapIndexed { index, it ->
            Profile(
                uuid = it.login.uuid,
                name = "${it.name.first} ${it.name.last}",
                age = it.dob.age,
                city = it.location.city,
                state = it.location.state,
                gender = it.gender,
                thumbnail = it.picture.thumbnail,
                index = index
            )
        }
}