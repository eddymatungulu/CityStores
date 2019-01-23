package com.goddy.citystoreslibrary.data.api

import android.arch.lifecycle.LiveData
import com.goddy.citystoreslibrary.models.City
import com.google.gson.annotations.SerializedName

data class WrapperResponse(
        @SerializedName("cities")
        val items: List<City>
)