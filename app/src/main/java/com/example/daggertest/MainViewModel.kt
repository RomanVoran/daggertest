package com.example.daggertest

import androidx.lifecycle.ViewModel
import javax.inject.Inject

class MainViewModel @Inject constructor(val db: DbRepo, val networkRepo: NetworkRepo) :
    ViewModel() {


}