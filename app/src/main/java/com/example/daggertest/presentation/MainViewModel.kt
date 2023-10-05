package com.example.daggertest.presentation

import androidx.lifecycle.ViewModel
import com.example.daggertest.data.DbRepo
import com.example.daggertest.data.NetworkRepo
import javax.inject.Inject

class MainViewModel @Inject constructor(val db: DbRepo, val networkRepo: NetworkRepo) :
    ViewModel() {


}