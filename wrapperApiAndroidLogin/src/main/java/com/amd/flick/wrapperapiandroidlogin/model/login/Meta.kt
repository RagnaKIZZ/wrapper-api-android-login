package com.amd.flick.wrapperapiandroidlogin.model.login

import com.google.gson.annotations.SerializedName

data class Meta(
    @SerializedName("code")
    var code: String? = null,

    @SerializedName("message")
    var message: String? = null
)