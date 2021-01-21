package com.amd.flick.wrapperapiandroidlogin.utils

import com.amd.flick.wrapperapiandroidlogin.BuildConfig

object Config {

    @JvmStatic
    fun uRl(): String {
        return if (BuildConfig.DEBUG) {
            "https://staging.flick.id/v1/"
        } else {
            "https://api.flick.id/v1/"
        }
    }

    @JvmStatic
    private fun POS_URL(): String {
        return if (BuildConfig.DEBUG) {
            "https://silvi.staging.flick.id/v1/"
//            "https://pos.api.flick.id/v1/"
        } else {
            "https://pos.api.flick.id/v1/"
        }
    }

    @JvmField
    var search_by_hp = uRl() + "users/hp/searching"

    @JvmField
    var login = uRl() + "users/auth/login"

    @JvmField
    var verifikasi_token_login = uRl() + "users/auth/verify-token/login"

    @JvmField
    var send_otp_login = uRl() + "users/auth/verifikasi-token/login"

    @JvmStatic
    fun RECRUITMENT(idUser: String): String {
        return POS_URL() + "employee/$idUser/recruitment"
    }

}