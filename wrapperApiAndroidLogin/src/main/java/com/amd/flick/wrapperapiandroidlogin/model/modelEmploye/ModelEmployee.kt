package com.amd.flick.wrapperapiandroidlogin.model.modelEmploye

import com.google.gson.annotations.SerializedName

data class ModelEmployee(
    @SerializedName("employee_email")
    var employeeEmail: String? = null,

    @SerializedName("employee_phone_number")
    var employeePhoneNumber: String? = null,

    @SerializedName("recruitment_token")
    var recruitmentToken: String? = null
)