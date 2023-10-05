package com.example.daggertest.entity

class Testtt<out T>() {

    private var t:T? = null


//    fun getT(t:T){
//        Log.d("TEST_TAG","T = ${t!!::class}")
//        Log.d("TEST_TAG","T = ${t!!::class.java}")
//    }

    fun getT():T{
        return t!!
    }



}



