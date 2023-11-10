package com.meucomp.app.modules.profile.`data`.model

import com.meucomp.app.R
import com.meucomp.app.appcomponents.di.MyApp
import kotlin.String

data class ProfileModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSamaraSantos: String? = MyApp.getInstance().resources.getString(R.string.lbl_samara_santos)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.msg_samarasant_gmai)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtText: String? = MyApp.getInstance().resources.getString(R.string.msg_qual_o_seu_prim)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextOne: String? = MyApp.getInstance().resources.getString(R.string.msg_qual_o_seu_sobr)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextThree: String? = MyApp.getInstance().resources.getString(R.string.msg_data_de_nascime)

)
