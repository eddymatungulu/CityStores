package com.goddy.citystoreslibrary.data.api

import android.arch.lifecycle.LiveData
import com.goddy.citystoreslibrary.models.City
import retrofit2.http.GET

interface ApiService{
    @GET
    fun fetchRemoteData():LiveData<ApiResponse<List<City>>>
}