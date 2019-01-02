package com.example.marti.weather.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Entity(tableName = "weather")
@Parcelize
data class Weather(
    @PrimaryKey
    val id: Int) : Parcelable