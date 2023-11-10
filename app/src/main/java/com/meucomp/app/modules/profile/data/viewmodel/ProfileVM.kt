package com.meucomp.app.modules.profile.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.meucomp.app.modules.profile.`data`.model.ProfileModel
import com.meucomp.app.modules.profile.`data`.model.SpinnerGroupFourteenModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ProfileVM : ViewModel(), KoinComponent {
  val profileModel: MutableLiveData<ProfileModel> = MutableLiveData(ProfileModel())

  var navArguments: Bundle? = null

  val spinnerGroupFourteenList: MutableLiveData<MutableList<SpinnerGroupFourteenModel>> =
      MutableLiveData()
}
