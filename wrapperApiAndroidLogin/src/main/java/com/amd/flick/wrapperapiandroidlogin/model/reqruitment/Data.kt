package com.amd.flick.wrapperapiandroidlogin.model.reqruitment

import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("recruitment")
    var recruitment: List<Any>? = null,

    @SerializedName("recruitment_status")
    var isRecruitmentStatus: Boolean
)