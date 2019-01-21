package com.goddy.citystoreslibrary.data.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.goddy.citystoreslibrary.models.City
import com.goddy.citystoreslibrary.models.Mall
import com.goddy.citystoreslibrary.models.Shop

@Database(
        entities = [
            City::class,
            Mall::class,
            Shop::class],
        version = 1,
        exportSchema = false)
abstract class AppDatabase : RoomDatabase(){
    abstract fun cityDao():CityDao
}