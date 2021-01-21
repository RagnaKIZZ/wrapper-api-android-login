package com.amd.flick.wrapperapiandroidlogin.demo

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.amd.flick.wrapperapiandroidlogin.LoginAPI
import com.amd.flick.wrapperapiandroidlogin.model.modelEmploye.ModelEmployee
import com.androidnetworking.error.ANError
import java.io.IOException

class Demo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
    }

    //this is how to use checkHP func in LoginAPI
    private fun checkHP() {
        val paramCheckHp = HashMap<String, String>()
        paramCheckHp.apply {
            put("hp", "some phone number")
            put("tipeUser", "some type of users")
        }

        LoginAPI.checkHP(
            paramCheckHp,
            onLoading = {
                //do something when loading state
            },
            onSuccess = {
                //do something when success state
            },
            onError = {
                //handle error
                when (it) {
                    is IOException -> {
                        // do something when ioexception
                    }

                    is ANError -> {
                        // do something when ANError
                    }
                }
            }
        )
    }

    //this is how to use getRecruitment func in LoginAPI
    private fun getRecruitment() {
        LoginAPI.getRecruitment(
            "some id",
            "some bearer token",
            onLoading = {
                //do something when loading state
            },
            onSuccess = {
                //do something when success state
            },
            onError = {
                //handle error
                when (it) {
                    is IOException -> {
                        // do something when ioexception
                    }

                    is ANError -> {
                        // do something when ANError
                    }
                }
            }
        )
    }

    private fun authLogin() {
        val paramAuthLogin = HashMap<String, String>()
        paramAuthLogin.apply {
            put("hp", "some phone number")
            put("password", "some password")
            put("tipeUser", "some type of users")
            put("otp", "some OTP token")
            put("loginKey", "some login key")
        }

        LoginAPI.authLogin(
            paramAuthLogin,
            onLoading = {
                //do something when loading state
            },
            onSuccess = {
                //do something when success state
            },
            onError = {
                //handle error
                when (it) {
                    is IOException -> {
                        // do something when ioexception
                    }

                    is ANError -> {
                        // do something when ANError
                    }
                }
            }
        )
    }

    private fun verifyToken() {
        val paramVerifyToken = HashMap<String, String>()
        paramVerifyToken.apply {
            put("hp", "some phone number")
            put("token", "some token")
            put("authProvider", "some auth provider")
            put("tipeUser", "some type of users")
        }

        LoginAPI.verifyToken(
            paramVerifyToken,
            onLoading = {
                //do something when loading state
            },
            onSuccess = {
                //do something when success state
            },
            onError = {
                //handle error
                when (it) {
                    is IOException -> {
                        // do something when ioexception
                    }

                    is ANError -> {
                        // do something when ANError
                    }
                }
            }
        )
    }

    private fun sendOTPLogin() {
        val paramOTPLogin = HashMap<String, String>()
        paramOTPLogin.apply {
            put("hp", "some phone number")
            put("length", "number of lenght")
            put("tipeData", "type of data")
            put("tipeUser", "some type of users")
        }

        LoginAPI.sendOTPLogin(
            paramOTPLogin,
            onLoading = {
                //do something when loading state
            },
            onSuccess = {
                //do something when success state
            },
            onError = {
                //handle error
                when (it) {
                    is IOException -> {
                        // do something when ioexception
                    }

                    is ANError -> {
                        // do something when ANError
                    }
                }
            }
        )
    }

    private fun preCheckEmploye() {
        val modelEmployee = ModelEmployee(
            "some email",
            "some phone number",
            "some token"
        )

        LoginAPI.preCheckEmploye(
            "some id",
            "some token",
            modelEmployee,
            onLoading = {
                //do something when loading state
            },
            onSuccess = {
                //do something when success state
            },
            onError = {
                //handle error
                when (it) {
                    is IOException -> {
                        // do something when ioexception
                    }

                    is ANError -> {
                        // do something when ANError
                    }
                }
            }
        )

    }

}