package com.goddy.citystoreslibrary.data.api

import org.json.JSONObject
import retrofit2.Call
import retrofit2.http.GET

interface ApiService{
    @GET("/v2/5b7e8bc03000005c0084c210")
    fun fetchRemoteData():Call<JSONObject>
}