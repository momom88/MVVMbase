package com.example.marti.weather.di

import android.app.Application
import androidx.room.Room
import com.example.marti.weather.data.database.AppDatabase
import com.example.marti.weather.data.database.WeatherDao
import com.example.marti.weather.data.networking.ApiInterface
import com.example.marti.weather.utils.SchedulerProvider
import dagger.Module
import dagger.Provides
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

//@Module(includes = [ViewModelModule::class])
class AppModule {

//    @Provides
//    @Singleton
//    fun provideSchedulerProvider() = SchedulerProvider(Schedulers.io(), AndroidSchedulers.mainThread())
//
//    @Provides
//    @Singleton
//    fun providesRetrofit(): ApiInterface {
//        return Retrofit.Builder()
//            .baseUrl(BASEURL)
//            .addConverterFactory(GsonConverterFactory.create())
//            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
//            .build()
//            .create(ApiInterface::class.java)
//    }
//
//    @Provides
//    @Singleton
//    fun provideMovieDatabase(app: Application): AppDatabase =
//        Room.databaseBuilder(
//            app,
//            AppDatabase::class.java, "movie_db"
//        )
//            .build()
//
//    @Provides
//    @Singleton
//    fun provideMovieDao(database: AppDatabase): WeatherDao = database.weatherDao()
}