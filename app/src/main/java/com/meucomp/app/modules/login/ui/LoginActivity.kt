package com.meucomp.app.modules.login.ui

import androidx.activity.viewModels
import com.meucomp.app.R
import com.meucomp.app.appcomponents.base.BaseActivity
import com.meucomp.app.appcomponents.googleauth.GoogleHelper
import com.meucomp.app.databinding.ActivityLoginBinding
import com.meucomp.app.modules.homescreencontainer.ui.HomescreenContainerActivity
import com.meucomp.app.modules.login.`data`.viewmodel.LoginVM
import kotlin.String
import kotlin.Unit

class LoginActivity : BaseActivity<ActivityLoginBinding>(R.layout.activity_login) {
  private val viewModel: LoginVM by viewModels<LoginVM>()

  private lateinit var googleLogin: GoogleHelper

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.loginVM = viewModel
    googleLogin = GoogleHelper(this,
    { accountInfo ->
      },{ error -> 

      })
    }

    override fun setUpClicks(): Unit {
      binding.btnLogin.setOnClickListener {
        val destIntent = HomescreenContainerActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      binding.linearGoogle.setOnClickListener {
        googleLogin.login()
      }
      binding.txtGoogleOne.setOnClickListener {
        val destIntent = HomescreenContainerActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    companion object {
      const val TAG: String = "LOGIN_ACTIVITY"

    }
  }
