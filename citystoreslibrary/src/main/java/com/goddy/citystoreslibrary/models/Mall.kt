package com.goddy.citystoreslibrary.models

import android.arch.persistence.room.Entity
import android.arch.persistence.room.ForeignKey
import android.arch.persistence.room.ForeignKey.CASCADE
import android.arch.persistence.room.Ignore
import android.arch.persistence.room.PrimaryKey

@Entity(foreignKeys = arrayOf(ForeignKey(
        entity = City::class,
        parentColumns = arrayOf("id"),
        childColumns = arrayOf("cityId"),
        onDelete = CASCADE,
        onUpdate = CASCADE
)))
data class Mall(
        @PrimaryKey
        val id: Int,
        val name: String,
        val cityId:Int,

        @Ignore
        var shops: List<Shop> = listOf())
