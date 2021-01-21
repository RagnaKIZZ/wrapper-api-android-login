package com.amd.flick.wrapperapiandroidlogin.model.login

import com.google.gson.annotations.SerializedName

data class ModelLogin(
    @SerializedName("data")
    var data: Data? = null,

    @SerializedName("meta")
    var meta: Meta? = null
)