package com.dysisdemo.ui.login

class LoginRepository(var loginDataSource: DataSource) {

    fun getLoginSuccessData(
        username: String?,
        password: String?,
        callBack: DataSource.ResponseCallBack
    ) {
        loginDataSource.callLogin(username, password, callBack)
    }
}