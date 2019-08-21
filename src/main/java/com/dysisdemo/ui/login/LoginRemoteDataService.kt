package com.dysisdemo.ui.login

import com.dysisdemo.data.model.LoginRequest
import com.dysisdemo.data.model.LoginResponse
import com.dysisdemo.data.rest.ApiServices
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LoginRemoteDataService : DataSource {
    override fun callLogin(
        username: String?,
        password: String?,
        callBack: DataSource.ResponseCallBack
    ) {
        var login = ApiServices.service.makeLoginCall(prepareRequest())
        login.enqueue(object : Callback<LoginResponse> {

            override fun onFailure(call: Call<LoginResponse>, t: Throwable) {
                callBack.onFailure(t.localizedMessage)
            }

            override fun onResponse(call: Call<LoginResponse>, response: Response<LoginResponse>) {
                if (response.isSuccessful) {
                    callBack.onDataLoad(response.body())
                } else callBack.onFailure(response.errorBody().toString())
            }

        })
    }


/*: DataSource {

    fun getLoginSuccessData(
        username: String?,
        password: String?,
        callBack: DataSource.ResponseCallBack) {
        var data: Call<LoginResponse> = ApiServices.service.makeLoginCall(prepareRequest())
        data.enqueue(object : Callback<LoginResponse> {
            override fun onFailure(call: Call<LoginResponse>, t: Throwable) {
                callBack.onFailure(t.localizedMessage)
            }

            override fun onResponse(call: Call<LoginResponse>, response: Response<LoginResponse>) {
                if (response.isSuccessful)
                    response.body()?.let { callBack.onDataLoad(it) }
                else callBack.onFailure(response.errorBody().toString())
            }
        })
    }*/


    //stub data for login
    private fun prepareRequest(): LoginRequest {
        var loginRequest = LoginRequest()
        loginRequest.eid = 123456
        loginRequest.emailaddress = "demosys@gmail.com"
        loginRequest.idbarahno = 1234565
        loginRequest.mobileno = "971556987002"
        loginRequest.name = "Demo"
        loginRequest.unifiednumber = 123
        return loginRequest
    }
}