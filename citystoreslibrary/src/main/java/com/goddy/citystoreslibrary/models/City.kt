package com.goddy.citystoreslibrary.models

import android.arch.persistence.room.Entity
import android.arch.persistence.room.Ignore
import android.arch.persistence.room.PrimaryKey

@Entity
data class City(
        @PrimaryKey
        var id: Int = 0,
        var  name: String = "",
        @Ignore
        var malls: List<Mall> = listOf())