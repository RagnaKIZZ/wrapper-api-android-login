package com.amd.flick.wrapperapiandroidlogin.model.responseOTP

import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("authProvider")
    var authProvider: String? = null,

    @SerializedName("token")
    var token: String? = null
)