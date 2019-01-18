package com.example.marti.mvvmbase.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize


//TODO change model if you need
@Entity(tableName = "weather")
@Parcelize
data class Weather(
    @PrimaryKey
    val id: Int) : Parcelable