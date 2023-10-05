package com.example.daggertest.di

import com.example.daggertest.presentation.MainActivity
import dagger.Component

@Component(modules = [DiModule::class])
interface AppComponent {

    fun injectToMainActivity(activity: MainActivity)

}