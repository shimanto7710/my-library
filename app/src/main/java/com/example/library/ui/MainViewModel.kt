package com.example.library.ui

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.library.network.Resource
import com.example.library.network.call.CallInfo
import com.example.library.network.call.NRCallback
import com.example.library.network.call.NetworkCallImpl
import com.example.library.network.response.DummyResponse
import kotlinx.coroutines.Dispatchers

class MainViewModel : ViewModel() {

    private val networkCall = NetworkCallImpl()


    fun perfectWay() = liveData(Dispatchers.IO){

        emit(Resource.loading(data = null))
        try {
            emit(Resource.success(data = networkCall.perfectWay()))
        } catch (exception: Exception) {
            emit(Resource.error(data = null, message = exception.message ?: "Error Occurred!"))
        }


    }


}