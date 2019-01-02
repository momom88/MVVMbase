package com.example.marti.weather

import android.app.Activity
import dagger.android.DispatchingAndroidInjector
import javax.inject.Inject

import android.app.Application
import com.example.marti.weather.di.AppInjector
import dagger.android.HasActivityInjector

class MainApp : Application(), HasActivityInjector {
    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()
        AppInjector.init(this)
    }

    override fun activityInjector() = dispatchingAndroidInjector
}