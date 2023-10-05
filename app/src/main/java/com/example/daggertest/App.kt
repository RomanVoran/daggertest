package com.example.daggertest

import android.app.Application

class App : Application() {

    val appComponent = DaggerAppComponent.create()
}