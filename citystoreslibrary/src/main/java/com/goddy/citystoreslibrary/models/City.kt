package com.goddy.citystoreslibrary.models

import android.arch.persistence.room.Entity
import android.arch.persistence.room.Ignore
import android.arch.persistence.room.PrimaryKey
import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName

@Entity
data class City(
        @PrimaryKey
        var id: Int = 0,
        var  name: String = "",
        @SerializedName("malls")
        var malls: List<Mall> = listOf()) : Parcelable {
        constructor(parcel: Parcel) : this(
                parcel.readInt(),
                parcel.readString(),
                TODO("malls")) {}

        override fun writeToParcel(parcel: Parcel, flags: Int) {
                parcel.writeInt(id)
                parcel.writeString(name)
        }

        override fun describeContents(): Int {
                return 0
        }

        companion object CREATOR : Parcelable.Creator<City> {
                override fun createFromParcel(parcel: Parcel): City {
                        return City(parcel)
                }

                override fun newArray(size: Int): Array<City?> {
                        return arrayOfNulls(size)
                }
        }
}