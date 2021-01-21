package com.amd.flick.wrapperapiandroidlogin.model.findHP

import com.google.gson.annotations.SerializedName

class ResponseFindHP(
    @SerializedName("data")
    private var data: Data? = null,

    @SerializedName("meta")
    var meta: Meta? = null
)