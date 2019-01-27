package com.goddy.citystoreslibrary.models

import android.arch.persistence.room.Entity
import android.arch.persistence.room.ForeignKey
import android.arch.persistence.room.ForeignKey.CASCADE
import android.arch.persistence.room.PrimaryKey
import android.os.Parcel
import android.os.Parcelable

@Entity(foreignKeys = arrayOf(ForeignKey(
        entity = Mall::class,
        parentColumns = arrayOf("id"),
        childColumns = arrayOf("mallId"),
        onDelete = CASCADE,
        onUpdate = CASCADE
)))
data class Shop(
        @PrimaryKey
        var id: Int = 0,
        var mallId:Int = 0,
        var name: String = ""
) : Parcelable {
        constructor(parcel: Parcel) : this(
                parcel.readInt(),
                parcel.readInt(),
                parcel.readString()) {}

        override fun writeToParcel(parcel: Parcel, flags: Int) {
                parcel.writeInt(id)
                parcel.writeInt(mallId)
                parcel.writeString(name)
        }

        override fun describeContents(): Int {
                return 0
        }

        companion object CREATOR : Parcelable.Creator<Shop> {
                override fun createFromParcel(parcel: Parcel): Shop {
                        return Shop(parcel)
                }

                override fun newArray(size: Int): Array<Shop?> {
                        return arrayOfNulls(size)
                }
        }
}