package com.meucomp.app.modules.registros.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.meucomp.app.modules.registros.`data`.model.RegistrosModel
import org.koin.core.KoinComponent

class RegistrosVM : ViewModel(), KoinComponent {
  val registrosModel: MutableLiveData<RegistrosModel> = MutableLiveData(RegistrosModel())

  var navArguments: Bundle? = null
}
