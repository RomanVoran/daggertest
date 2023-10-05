package com.example.daggertest

import android.app.Application
import com.example.daggertest.di.DaggerAppComponent

class App : Application() {

    val appComponent = DaggerAppComponent.create()
}