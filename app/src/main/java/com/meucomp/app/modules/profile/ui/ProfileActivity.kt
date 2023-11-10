package com.meucomp.app.modules.profile.ui

import android.content.Intent
import androidx.activity.viewModels
import com.meucomp.app.R
import com.meucomp.app.appcomponents.base.BaseActivity
import com.meucomp.app.databinding.ActivityProfileBinding
import com.meucomp.app.modules.homescreencontainer.ui.HomescreenContainerActivity
import com.meucomp.app.modules.profile.`data`.model.SpinnerGroupFourteenModel
import com.meucomp.app.modules.profile.`data`.viewmodel.ProfileVM
import kotlin.String
import kotlin.Unit

class ProfileActivity : BaseActivity<ActivityProfileBinding>(R.layout.activity_profile) {
  private val viewModel: ProfileVM by viewModels<ProfileVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerGroupFourteenList.value = mutableListOf(
    SpinnerGroupFourteenModel("Item1"),
    SpinnerGroupFourteenModel("Item2"),
    SpinnerGroupFourteenModel("Item3"),
    SpinnerGroupFourteenModel("Item4"),
    SpinnerGroupFourteenModel("Item5")
    )
    val spinnerGroupFourteenAdapter =
    SpinnerGroupFourteenAdapter(this,R.layout.spinner_item,viewModel.spinnerGroupFourteenList.value?:
    mutableListOf())
    binding.spinnerGroupFourteen.adapter = spinnerGroupFourteenAdapter
    binding.profileVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageHome.setOnClickListener {
      val destIntent = HomescreenContainerActivity.getIntent(this, null)
      destIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "PROFILE_ACTIVITY"

  }
}
