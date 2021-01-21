package com.amd.flick.wrapperapiandroidlogin.model.responseOTP

import com.google.gson.annotations.SerializedName

data class ResponseGetToken(
    @SerializedName("data")
    var data: Data? = null,

    @SerializedName("meta")
    var meta: Meta? = null
)