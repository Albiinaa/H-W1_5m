package com.geeks.hw_2_5m

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface LoveApiService {

    @GET("getPercentage")
    fun getPercentage(
        @Header("X-Rapidapi-Key") key : String,
        @Header("X-Rapidapi-Host") host : String,
        @Query("fname") firstName: String,
        @Query("sname") secondName: String
    ): Call<LoveModel>

    abstract fun getPercentage(key: String, host: String): Call<LoveModel>
}