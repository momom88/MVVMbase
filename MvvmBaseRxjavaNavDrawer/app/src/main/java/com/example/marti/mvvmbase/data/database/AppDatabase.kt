package com.example.marti.mvvmbase.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.marti.mvvmbase.model.Weather

//TODO change app if you need
@Database(entities = [Weather::class], version = 1, exportSchema = false)
abstract class AppDatabase: RoomDatabase(){
    abstract fun weatherDao(): WeatherDao
}