package com.meucomp.app.modules.login.`data`.model

import com.meucomp.app.R
import com.meucomp.app.appcomponents.di.MyApp
import kotlin.String

data class LoginModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLoginMeuComp: String? = MyApp.getInstance().resources.getString(R.string.lbl_login_meucomp)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEntrecomseun: String? =
      MyApp.getInstance().resources.getString(R.string.msg_entre_com_seu_n)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtText: String? = MyApp.getInstance().resources.getString(R.string.msg_digite_seu_n_me)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMudarnmero: String? = MyApp.getInstance().resources.getString(R.string.lbl_mudar_n_mero)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOuentrarcom: String? = MyApp.getInstance().resources.getString(R.string.lbl_ou_entrar_com)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGoogleOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_google)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNotemumacon: String? =
      MyApp.getInstance().resources.getString(R.string.msg_n_o_tem_uma_con)

)
