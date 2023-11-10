package com.meucomp.app.modules.homescreencontainer.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.meucomp.app.modules.homescreencontainer.`data`.model.HomescreenContainerModel
import org.koin.core.KoinComponent

class HomescreenContainerVM : ViewModel(), KoinComponent {
  val homescreenContainerModel: MutableLiveData<HomescreenContainerModel> =
      MutableLiveData(HomescreenContainerModel())

  var navArguments: Bundle? = null
}
