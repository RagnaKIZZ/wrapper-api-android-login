package com.amd.flick.wrapperapiandroidlogin

import android.app.Application
import com.androidnetworking.AndroidNetworking

class MyLoginWrap : Application() {

    override fun onCreate() {
        super.onCreate()

        AndroidNetworking.initialize(this)

    }

}