package com.example.marti.mvvmbase.di

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