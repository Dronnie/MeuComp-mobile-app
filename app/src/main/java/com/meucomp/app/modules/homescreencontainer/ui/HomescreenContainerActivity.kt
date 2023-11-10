package com.meucomp.app.modules.homescreencontainer.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.meucomp.app.R
import com.meucomp.app.appcomponents.base.BaseActivity
import com.meucomp.app.databinding.ActivityHomescreenContainerBinding
import com.meucomp.app.extensions.loadFragment
import com.meucomp.app.modules.homescreen.ui.HomescreenFragment
import com.meucomp.app.modules.homescreencontainer.`data`.viewmodel.HomescreenContainerVM
import com.meucomp.app.modules.schedule.ui.ScheduleFragment
import kotlin.String
import kotlin.Unit

class HomescreenContainerActivity :
    BaseActivity<ActivityHomescreenContainerBinding>(R.layout.activity_homescreen_container) {
  private val viewModel: HomescreenContainerVM by viewModels<HomescreenContainerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.homescreenContainerVM = viewModel
    val destFragment = HomescreenFragment.getInstance(null)
    this.loadFragment(
    R.id.fragmentContainer,
    destFragment,
    bundle = destFragment.arguments,
    tag = HomescreenFragment.TAG,
    addToBackStack = false,
    add = false,
    enter = null,
    exit = null,
    )
  }

  override fun setUpClicks(): Unit {
    binding.imageCar.setOnClickListener {
      val destFragment = HomescreenFragment.getInstance(null)
      this.loadFragment(
      R.id.fragmentContainer,
      destFragment,
      bundle = destFragment.arguments,
      tag = HomescreenFragment.TAG,
      addToBackStack = true,
      add = false,
      enter = null,
      exit = null,
      )
    }
    binding.imageCalendar.setOnClickListener {
      val destFragment = ScheduleFragment.getInstance(null)
      this.loadFragment(
      R.id.fragmentContainer,
      destFragment,
      bundle = destFragment.arguments,
      tag = ScheduleFragment.TAG,
      addToBackStack = true,
      add = false,
      enter = null,
      exit = null,
      )
    }
  }

  companion object {
    const val TAG: String = "HOMESCREEN_CONTAINER_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HomescreenContainerActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
