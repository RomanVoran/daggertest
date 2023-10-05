package com.example.daggertest.data

import android.util.Log
import javax.inject.Inject

class DbRepo @Inject constructor() {

    fun getMessage() {
        Log.d("TEST_TAG", "message from db = '!@#!@#!@#'")
    }
}