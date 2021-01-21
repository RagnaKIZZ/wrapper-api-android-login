package com.amd.flick.wrapperapiandroidlogin.wrapper.api

import com.amd.flick.wrapperapiandroidlogin.model.findHP.ResponseFindHP
import com.amd.flick.wrapperapiandroidlogin.model.login.ModelLogin
import com.amd.flick.wrapperapiandroidlogin.model.modelEmploye.ModelEmployee
import com.amd.flick.wrapperapiandroidlogin.model.reqruitment.ModelRecruitment
import com.amd.flick.wrapperapiandroidlogin.model.responseMeta.ResponseMeta
import com.amd.flick.wrapperapiandroidlogin.model.responseOTP.ResponseGetToken
import com.amd.flick.wrapperapiandroidlogin.utils.Config
import com.amd.flick.wrapperapiandroidlogin.utils.Constants
import com.rx2androidnetworking.Rx2AndroidNetworking
import io.reactivex.Flowable
import io.reactivex.Single

class ApiServiceImpl : ApiService {

    override fun checkHP(param: HashMap<String, String>): Single<ResponseFindHP> {
        return Rx2AndroidNetworking.get(Config.search_by_hp)
            .addQueryParameter(param)
            .build()
            .getObjectSingle(ResponseFindHP::class.java)
    }

    override fun getRecruitment(
        id: String,
        token: String,
    ): Single<ModelRecruitment> {
        return Rx2AndroidNetworking.get(Config.RECRUITMENT(id))
            .addHeaders(Constants.AUTH, token)
            .build()
            .getObjectSingle(ModelRecruitment::class.java)
    }

    override fun authLogin(param: HashMap<String, String>): Flowable<ModelLogin> {
        return Rx2AndroidNetworking.post(Config.login)
            .addQueryParameter(param)
            .build()
            .getObjectFlowable(ModelLogin::class.java)
    }

    override fun verifyToken(param: HashMap<String, String>): Single<ResponseMeta> {
        return Rx2AndroidNetworking.get(Config.verifikasi_token_login)
            .addQueryParameter(param)
            .build()
            .getObjectSingle(ResponseMeta::class.java)
    }

    override fun sendOTPLogin(param: HashMap<String, String>): Flowable<ResponseGetToken> {
        return Rx2AndroidNetworking.post(Config.send_otp_login)
            .addQueryParameter(param)
            .build()
            .getObjectFlowable(ResponseGetToken::class.java)
    }

    override fun preCheckEmploye(
        id: String,
        token: String,
        param: ModelEmployee
    ): Single<ModelRecruitment> {
        return Rx2AndroidNetworking.post(Config.RECRUITMENT(id))
            .addHeaders(Constants.AUTH, token)
            .addApplicationJsonBody(param)
            .build()
            .getObjectSingle(ModelRecruitment::class.java)
    }
}
