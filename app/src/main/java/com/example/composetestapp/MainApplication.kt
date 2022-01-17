package com.example.composetestapp

import android.app.Application



class MainApplication: Application() {

    override fun onCreate() {
        super.onCreate()
//        // Start Koin
//        startKoin{
//            androidLogger()
//            androidContext(this@MainApplication)
//            modules(AppModule.module)
//        }
    }
}