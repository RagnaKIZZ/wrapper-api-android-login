# wrapper-api-android-login
silvi wrapper api

### How To Use
     dependencies {
     	        implementation 'com.github.RagnaKIZZ:wrapper-api-android-login:Tag'
     	}
     
     
### `and` 
     
     allprojects {
     		repositories {
     			...
     			maven { url 'https://jitpack.io' }
     		}
     	}

### To use checkHP
```kotlin

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
```        

### To use getRecruitment
```kotlin

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
```        
        
### To use authLogin
```kotlin

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
 ```       
        
 ### To use verifyToken
 ```kotlin
 
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
```        
        
### To use sendOTPLogin
 ```kotlin
 
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
```        
        
### To use preCheckEmploye
```kotlin

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
        
 ```       
        
        
        
### License
          
    Copyright 2020 PT. Kreigan Sentral Teknologi
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
          
    http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
