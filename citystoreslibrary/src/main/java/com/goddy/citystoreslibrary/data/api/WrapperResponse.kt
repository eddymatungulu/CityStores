package com.goddy.citystoreslibrary.data.api

import com.goddy.citystoreslibrary.models.City
import com.google.gson.annotations.SerializedName

data class WrapperResponse(
        @SerializedName("cities")
        val items: ApiResponse<List<City>>
)