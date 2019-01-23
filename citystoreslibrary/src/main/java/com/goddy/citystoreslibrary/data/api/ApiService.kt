package com.goddy.citystoreslibrary.data.api

import android.arch.lifecycle.LiveData
import retrofit2.http.GET

interface ApiService{
    @GET("/v2/5b7e8bc03000005c0084c210")
    fun fetchRemoteData():LiveData<WrapperResponse>
}