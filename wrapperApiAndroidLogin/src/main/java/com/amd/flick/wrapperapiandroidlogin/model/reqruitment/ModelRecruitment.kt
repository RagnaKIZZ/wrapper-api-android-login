package com.amd.flick.wrapperapiandroidlogin.model.reqruitment

import com.google.gson.annotations.SerializedName

data class ModelRecruitment(
    @SerializedName("data")
    var data: Data? = null,

    @SerializedName("meta")
    var meta: Meta? = null
)