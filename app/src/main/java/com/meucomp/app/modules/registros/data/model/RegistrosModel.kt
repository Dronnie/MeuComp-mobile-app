package com.meucomp.app.modules.registros.`data`.model

import com.meucomp.app.R
import com.meucomp.app.appcomponents.di.MyApp
import kotlin.String

data class RegistrosModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMeuComp: String? = MyApp.getInstance().resources.getString(R.string.lbl_meucomp)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddnewEvent: String? = MyApp.getInstance().resources.getString(R.string.lbl_registrar)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSearching: String? = MyApp.getInstance().resources.getString(R.string.lbl_data)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRemindsme: String? = MyApp.getInstance().resources.getString(R.string.msg_selecionar_cate)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDesign: String? = MyApp.getInstance().resources.getString(R.string.lbl_emo_es)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddnew: String? = MyApp.getInstance().resources.getString(R.string.msg_adicionar_mai)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etTextcomponentValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etTextboxcomponValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etHorarioinicialValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etHorariofinalValue: String? = null
)
