package com.amd.flick.wrapperapiandroidlogin.model.responseMeta

import com.google.gson.annotations.SerializedName

data class ResponseMeta(
    @SerializedName("meta")
    private var meta: Meta? = null
)