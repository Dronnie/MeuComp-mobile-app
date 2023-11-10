package com.meucomp.app.modules.registros.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.meucomp.app.R
import com.meucomp.app.appcomponents.base.BaseActivity
import com.meucomp.app.databinding.ActivityRegistrosBinding
import com.meucomp.app.modules.registros.`data`.viewmodel.RegistrosVM
import kotlin.String
import kotlin.Unit

class RegistrosActivity : BaseActivity<ActivityRegistrosBinding>(R.layout.activity_registros) {
  private val viewModel: RegistrosVM by viewModels<RegistrosVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.registrosVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "REGISTROS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, RegistrosActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
