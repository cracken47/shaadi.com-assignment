package com.karan.shaadidotcom.networking

import com.karan.shaadidotcom.model.NetworkProfileResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiRestInterface {

    @GET("api")
    suspend fun getProfiles(@Query("results") maxProfiles: Int): NetworkProfileResponse
}