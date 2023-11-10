package com.meucomp.app.modules.homescreen.ui

import android.os.Bundle
import androidx.fragment.app.viewModels
import com.meucomp.app.R
import com.meucomp.app.appcomponents.base.BaseFragment
import com.meucomp.app.databinding.FragmentHomescreenBinding
import com.meucomp.app.modules.homescreen.`data`.viewmodel.HomescreenVM
import kotlin.String
import kotlin.Unit

class HomescreenFragment : BaseFragment<FragmentHomescreenBinding>(R.layout.fragment_homescreen) {
  private val viewModel: HomescreenVM by viewModels<HomescreenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.homescreenVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "HOMESCREEN_FRAGMENT"


    fun getInstance(bundle: Bundle?): HomescreenFragment {
      val fragment = HomescreenFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
