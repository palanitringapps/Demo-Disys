package com.dysisdemo.ui.login

import com.dysisdemo.data.model.LoginResponse

interface DataSource {

    interface ResponseCallBack {
        fun onDataLoad(response: LoginResponse?)

        fun onFailure(result: String)
    }

    fun callLogin(username: String?, password: String?, callBack: ResponseCallBack)

}