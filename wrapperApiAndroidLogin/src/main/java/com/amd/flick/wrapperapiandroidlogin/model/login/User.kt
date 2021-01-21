package com.amd.flick.wrapperapiandroidlogin.model.login

import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("statusVerification")
    var statusVerification: String? = null,

    @SerializedName("nama")
    var nama: String? = null,

    @SerializedName("namaSesuaiKtp")
    var namaSesuaiKtp: String? = null,

    @SerializedName("hp")
    var hp: String? = null,

    @SerializedName("tipeUser")
    var tipeUser: String? = null,

    @SerializedName("id")
    var id: String? = null,

    @SerializedName("loggedInTimestamp")
    var loggedInTimestamp: String? = null,

    @SerializedName("email")
    var email: String? = null,

    @SerializedName("status")
    var status: String? = null
)