package com.amd.flick.wrapperapiandroidlogin.model.responseMeta

import com.google.gson.annotations.SerializedName

data class Meta(
    @SerializedName("code")
    private var code: String? = null,

    @SerializedName("message")
    private val message: String? = null
)