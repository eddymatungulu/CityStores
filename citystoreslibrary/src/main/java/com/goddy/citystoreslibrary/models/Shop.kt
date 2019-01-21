package com.goddy.citystoreslibrary.models

import android.arch.persistence.room.Entity
import android.arch.persistence.room.ForeignKey
import android.arch.persistence.room.ForeignKey.CASCADE
import android.arch.persistence.room.PrimaryKey

@Entity(foreignKeys = arrayOf(ForeignKey(
        entity = Mall::class,
        parentColumns = arrayOf("id"),
        childColumns = arrayOf("mallId"),
        onDelete = CASCADE,
        onUpdate = CASCADE
)))
data class Shop(
        @PrimaryKey
        val id: Int,
        val mallId:Int,
        val name: String
)