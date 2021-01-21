package com.amd.flick.wrapperapiandroidlogin

import android.app.Application
import com.androidnetworking.AndroidNetworking
import com.facebook.stetho.Stetho
import com.facebook.stetho.okhttp3.StethoInterceptor
import okhttp3.OkHttpClient
import java.util.concurrent.TimeUnit

class MyLoginWrap : Application() {

    override fun onCreate() {
        super.onCreate()
        Stetho.initializeWithDefaults(this)
        val okHttpClient = OkHttpClient().newBuilder()
            .addNetworkInterceptor(StethoInterceptor())
            .connectTimeout(120, TimeUnit.SECONDS)
            .readTimeout(120, TimeUnit.SECONDS)
            .writeTimeout(120, TimeUnit.SECONDS)
            .build()
        AndroidNetworking.enableLogging()
        AndroidNetworking.initialize(this, okHttpClient)

    }

}