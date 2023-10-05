package com.example.daggertest

import dagger.Component

@Component(modules = [DiModule::class])
interface AppComponent {

    fun injectToMainActivity(activity: MainActivity)

}