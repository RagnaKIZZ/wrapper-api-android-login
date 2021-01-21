package com.amd.flick.wrapperapiandroidlogin.model.login

import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("next-login-key")
    var nextLoginKey: String? = null,

    @SerializedName("refresh-token")
    var refreshToken: String? = null,

    @SerializedName("access-token")
    var accessToken: String? = null,

    @SerializedName("user")
    var user: User? = null
)