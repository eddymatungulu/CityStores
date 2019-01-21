package com.goddy.citystoreslibrary.data.db

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query
import com.goddy.citystoreslibrary.models.City
import com.goddy.citystoreslibrary.models.Mall
import com.goddy.citystoreslibrary.models.Shop

@Dao
interface CityDao{
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertCity(cities:List<City>)

    @Query("SELECT * FROM city ")
    fun fetchCities():LiveData<List<City>>

    @Query("SELECT * FROM city WHERE id = :id ")
    fun getCity(id:Int):LiveData<City>

    @Query("SELECT * FROM mall WHERE cityId = :cityId ")
    fun fetchMalls(cityId:Int):LiveData<List<Mall>>

    @Query("SELECT * FROM mall WHERE id = :id ")
    fun getMall(id:Int):LiveData<Mall>

    @Query("SELECT * FROM shop WHERE mallId = :mallId ")
    fun fetchShops(mallId:Int):LiveData<List<Shop>>

    @Query("SELECT * FROM shop WHERE id = :id ")
    fun getShop(id:Int):LiveData<Shop>
}