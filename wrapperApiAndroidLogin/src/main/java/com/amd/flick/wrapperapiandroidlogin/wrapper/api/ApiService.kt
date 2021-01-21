package com.amd.flick.wrapperapiandroidlogin.wrapper.api

import com.amd.flick.wrapperapiandroidlogin.model.findHP.ResponseFindHP
import com.amd.flick.wrapperapiandroidlogin.model.login.ModelLogin
import com.amd.flick.wrapperapiandroidlogin.model.modelEmploye.ModelEmployee
import com.amd.flick.wrapperapiandroidlogin.model.reqruitment.ModelRecruitment
import com.amd.flick.wrapperapiandroidlogin.model.responseMeta.ResponseMeta
import com.amd.flick.wrapperapiandroidlogin.model.responseOTP.ResponseGetToken
import io.reactivex.Flowable
import io.reactivex.Single

interface ApiService {

    fun checkHP(param: HashMap<String, String>): Single<ResponseFindHP>

    fun getRecruitment(
        id: String,
        token: String,
    ): Single<ModelRecruitment>

    fun preCheckEmploye(id: String, token: String, param: ModelEmployee): Single<ModelRecruitment>

    fun authLogin(param: HashMap<String, String>): Flowable<ModelLogin>

    fun verifyToken(param: HashMap<String, String>): Single<ResponseMeta>

    fun sendOTPLogin(param: HashMap<String, String>): Flowable<ResponseGetToken>

}