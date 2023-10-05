package com.example.daggertest

import dagger.Module
import dagger.Provides

@Module
class DiModule {

    @Provides
    fun getDb() = DbRepo()

    @Provides
    fun getNetwork() = NetworkRepo()


}