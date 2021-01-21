package com.amd.flick.wrapperapiandroidlogin.model.findHP

import com.google.gson.annotations.SerializedName

class Profil(
    @SerializedName("statusVerification")
    var statusVerification: String? = null,

    @SerializedName("nama")
    var nama: String? = null,

    @SerializedName("hp")
    var hp: String? = null,

    @SerializedName("tipeUser")
    var tipeUser: String? = null,

    @SerializedName("id")
    var id: String? = null,

    @SerializedName("email")
    var email: String? = null,

    @SerializedName("username")
    var username: String? = null
)