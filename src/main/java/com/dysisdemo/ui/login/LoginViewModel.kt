package com.dysisdemo.ui.login

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.dysisdemo.base.BaseViewModel
import com.dysisdemo.data.model.LoginResponse
import com.dysisdemo.db.DisysDatabase
import com.dysisdemo.db.UserLoginData
import com.dysisdemo.db.UserLoginDataDao
import com.dysisdemo.util.NetworkConnectionUtil
import org.jetbrains.anko.doAsync

class LoginViewModel(
    app: Application, var loginRepository: LoginRepository, var view: LoginView,
    var username: String?, var password: String?
) : BaseViewModel(app), DataSource.ResponseCallBack {

    override fun onDataLoad(response: LoginResponse?) {

        doAsync {
            val database = DisysDatabase.getInstance(getApplication())
            var userLoginData = UserLoginData()
            userLoginData.message = response!!.message!!
            userLoginData.referenceNo = response.payload!!.referenceNo!!
            userLoginData.success = response.success.toString()
            database.userLoginDataDao().insert(userLoginData)
        }

        view.showLoginSuccess()
    }

    override fun onFailure(result: String) {
        view.showLoginFailed()
    }

    fun loginUser() {
        if (NetworkConnectionUtil.isNetworkConnected(getApplication()))
            loginRepository.getLoginSuccessData(username, password, this)
        else view.showLoginFailed()
    }


    class LoginModelFactory(
        private val application: Application,
        private val loginRepository: LoginRepository,
        private val view: LoginView, private val username: String, private val password: String
    ) : ViewModelProvider.NewInstanceFactory() {
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            return modelClass.getConstructor(
                Application::class.java, LoginRepository::class.java,
                LoginView::class.java, String::class.java, String::class.java
            )
                .newInstance(application, loginRepository, view, username, password)
        }
    }
}