package com.amd.flick.wrapperapiandroidlogin.model.responseMeta

import com.google.gson.annotations.SerializedName

data class Meta(
    @SerializedName("code")
    var code: String? = null,

    @SerializedName("message")
    val message: String? = null
)