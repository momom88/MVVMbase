package com.example.marti.weather.di

import com.example.marti.weather.ui.weatherlist.WeatherListFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Suppress("unused")
@Module
abstract class FragmentBuildersModule {
//    @ContributesAndroidInjector
//    abstract fun contributeMainFragment(): MoviesListFragment
//
//    @ContributesAndroidInjector
//    abstract fun contributeDetailFragment(): DetailFragment
//
//    @ContributesAndroidInjector
//    abstract fun contributeAboutFragment(): AboutFragment

    @ContributesAndroidInjector
    abstract fun contributeWeatherList(): WeatherListFragment

}