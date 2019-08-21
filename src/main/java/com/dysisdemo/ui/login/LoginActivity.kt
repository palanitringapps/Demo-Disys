package com.dysisdemo.ui.login

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.dysisdemo.R
import com.dysisdemo.databinding.ActivityMainBinding
import com.dysisdemo.ui.news.NewsListActivity

class LoginActivity : AppCompatActivity(), LoginView {

    private lateinit var bind: ActivityMainBinding
    private lateinit var viewModel: LoginViewModel

    override fun showLoginSuccess() {
        startActivity(Intent(this, NewsListActivity::class.java))
    }

    override fun showLoginFailed() {
        Toast.makeText(this, getString(R.string.login_failed), Toast.LENGTH_SHORT).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val repository = LoginRepository(LoginRemoteDataService())
        val inviteModelFactory = LoginViewModel.LoginModelFactory(
            application, repository, this,
            bind.etUsername.text.toString(), bind.etPassword.text.toString()
        )
        viewModel =
            ViewModelProviders.of(this, inviteModelFactory).get(LoginViewModel::class.java)
        bind.login = viewModel
    }
}