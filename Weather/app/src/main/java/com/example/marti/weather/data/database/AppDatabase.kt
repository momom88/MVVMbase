package com.example.marti.weather.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.marti.weather.model.Weather

@Database(entities = [Weather::class], version = 1, exportSchema = false)
abstract class AppDatabase: RoomDatabase(){
    abstract fun weatherDao(): WeatherDao
}