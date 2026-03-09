package com.mikitazayanchkouski.pexelskmp

import android.app.Application
import com.mikitazayanchkouski.pexelskmp.di.initKoin
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger

class PexelsApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        initKoin {
            androidContext(androidContext = this@PexelsApplication)
            androidLogger()
        }
    }
}