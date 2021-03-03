package com.example.library.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.lifecycle.lifecycleScope
import com.example.library.R
import com.example.library.network.Status
import com.example.library.network.call.CallInfo
import com.example.library.network.call.NRCallback
import com.example.library.network.call.NetworkCallImpl

import com.example.library.network.response.DummyResponse
import kotlinx.coroutines.launch


class MainActivity : AppCompatActivity() {
    private val networkCall = NetworkCallImpl()

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // initialization
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)





    }


}