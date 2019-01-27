package com.goddy.citystoreslibrary.models

import android.arch.persistence.room.Entity
import android.arch.persistence.room.ForeignKey
import android.arch.persistence.room.ForeignKey.CASCADE
import android.arch.persistence.room.Ignore
import android.arch.persistence.room.PrimaryKey
import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName

@Entity(foreignKeys = arrayOf(ForeignKey(
        entity = City::class,
        parentColumns = arrayOf("id"),
        childColumns = arrayOf("cityId"),
        onDelete = CASCADE,
        onUpdate = CASCADE
)))
data class Mall(
        @PrimaryKey
        var id: Int = 0,
        var name: String = "",
        var cityId:Int = 0,
        @SerializedName("shops")
        var shops: List<Shop> = listOf()) : Parcelable {
        constructor(parcel: Parcel) : this(
                parcel.readInt(),
                parcel.readString(),
                parcel.readInt(),
                TODO("shops")) {}

        override fun writeToParcel(parcel: Parcel, flags: Int) {
                parcel.writeInt(id)
                parcel.writeString(name)
                parcel.writeInt(cityId)
        }

        override fun describeContents(): Int {
                return 0
        }

        companion object CREATOR : Parcelable.Creator<Mall> {
                override fun createFromParcel(parcel: Parcel): Mall {
                        return Mall(parcel)
                }

                override fun newArray(size: Int): Array<Mall?> {
                        return arrayOfNulls(size)
                }
        }
}
