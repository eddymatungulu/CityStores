package com.goddy.citystoreslibrary.models

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
data class City(
        @PrimaryKey
        val id: Int,
        val name: String,
        var malls: List<Mall> = listOf())