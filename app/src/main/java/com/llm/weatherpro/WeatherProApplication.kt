package com.llm.weatherpro

import android.app.Application
import android.content.Context

class WeatherProApplication : Application() {

    companion object {
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}