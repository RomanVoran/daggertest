package com.example.daggertest.di

import com.example.daggertest.presentation.MainActivity
import dagger.Component
import dagger.Module

@Component(modules = [AppModule::class])
interface AppComponent {

    fun injectToMainActivity(activity: MainActivity)

}

@Module
class AppModule