package com.amd.flick.wrapperapiandroidlogin

import com.amd.flick.wrapperapiandroidlogin.model.findHP.ResponseFindHP
import com.amd.flick.wrapperapiandroidlogin.model.login.ModelLogin
import com.amd.flick.wrapperapiandroidlogin.model.modelEmploye.ModelEmployee
import com.amd.flick.wrapperapiandroidlogin.model.reqruitment.ModelRecruitment
import com.amd.flick.wrapperapiandroidlogin.model.responseMeta.ResponseMeta
import com.amd.flick.wrapperapiandroidlogin.model.responseOTP.ResponseGetToken
import com.amd.flick.wrapperapiandroidlogin.utils.SchedulerProvider
import com.amd.flick.wrapperapiandroidlogin.wrapper.api.ApiServiceImpl
import io.reactivex.disposables.CompositeDisposable

class LoginAPI {

    companion object {
        private val apiHelper = ApiServiceImpl()
        private val compositeDisposable = CompositeDisposable()
        private val schedulerProvider = SchedulerProvider()

        fun checkHP(
            param: HashMap<String, String>,
            onLoading: (() -> Unit),
            onSuccess: ((ResponseFindHP) -> Unit),
            onError: ((Throwable) -> Unit)
        ) {
            onLoading()
            compositeDisposable.add(
                apiHelper.checkHP(param)
                    .compose(schedulerProvider.ioToMainSingleScheduler())
                    .subscribe({ resultData ->
                        onSuccess(resultData)
                    }, { throwable ->
                        onError(throwable)
                    })
            )
        }


        fun getRecruitment(
            id: String,
            token: String,
            onLoading: (() -> Unit),
            onSuccess: ((ModelRecruitment) -> Unit),
            onError: ((Throwable) -> Unit)
        ) {
            onLoading()
            compositeDisposable.add(
                apiHelper.getRecruitment(id, token)
                    .compose(schedulerProvider.ioToMainSingleScheduler())
                    .subscribe({ resultData ->
                        onSuccess(resultData)
                    }, { throwable ->
                        onError(throwable)
                    })
            )
        }

        fun authLogin(
            param: HashMap<String, String>,
            onLoading: (() -> Unit),
            onSuccess: ((ModelLogin) -> Unit),
            onError: ((Throwable) -> Unit)
        ) {
            onLoading()
            compositeDisposable.add(
                apiHelper.authLogin(param)
                    .compose(schedulerProvider.ioToMainFlowableScheduler())
                    .subscribe({ resultData ->
                        onSuccess(resultData)
                    }, { throwable ->
                        onError(throwable)
                    })
            )
        }

        fun verifyToken(
            param: HashMap<String, String>,
            onLoading: (() -> Unit),
            onSuccess: ((ResponseMeta) -> Unit),
            onError: ((Throwable) -> Unit)
        ){
            onLoading()
            compositeDisposable.add(
                apiHelper.verifyToken(param)
                    .compose(schedulerProvider.ioToMainSingleScheduler())
                    .subscribe({ resultData ->
                        onSuccess(resultData)
                    }, { throwable ->
                        onError(throwable)
                    })
            )
        }

        fun sendOTPLogin(
            param: HashMap<String, String>,
            onLoading: (() -> Unit),
            onSuccess: ((ResponseGetToken) -> Unit),
            onError: ((Throwable) -> Unit)
        ){
            onLoading()
            compositeDisposable.add(
                apiHelper.sendOTPLogin(param)
                    .compose(schedulerProvider.ioToMainFlowableScheduler())
                    .subscribe({ resultData ->
                        onSuccess(resultData)
                    }, { throwable ->
                        onError(throwable)
                    })
            )
        }

        fun preCheckEmploye(
            id: String,
            token: String,
            param: ModelEmployee,
            onLoading: (() -> Unit),
            onSuccess: ((ModelRecruitment) -> Unit),
            onError: ((Throwable) -> Unit)
        ){
            onLoading()
            compositeDisposable.add(
                apiHelper.preCheckEmploye(id, token, param)
                    .compose(schedulerProvider.ioToMainSingleScheduler())
                    .subscribe({ resultData ->
                        onSuccess(resultData)
                    }, { throwable ->
                        onError(throwable)
                    })
            )
        }

    }

}