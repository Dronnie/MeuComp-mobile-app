package com.meucomp.app.modules.homescreen.`data`.model

import com.meucomp.app.R
import com.meucomp.app.appcomponents.di.MyApp
import kotlin.String

data class HomescreenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRegistros: String? = MyApp.getInstance().resources.getString(R.string.lbl_registros)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTodasascatego: String? =
      MyApp.getInstance().resources.getString(R.string.msg_todas_as_catego)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTexto: String? = MyApp.getInstance().resources.getString(R.string.msg_pensamentos_dis)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextoOne: String? = MyApp.getInstance().resources.getString(R.string.msg_registro_de_emo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRegistrosdeSi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_registros_de_si)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSuasTarefasOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_suas_tarefas)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrximastarefa: String? =
      MyApp.getInstance().resources.getString(R.string.msg_pr_ximas_tarefa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEstabelecimentoOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_estabelecimento)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtText: String? = MyApp.getInstance().resources.getString(R.string.msg_escrever_10_met)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDate: String? = MyApp.getInstance().resources.getString(R.string.lbl_12_04)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJulieWatson: String? = MyApp.getInstance().resources.getString(R.string.lbl_julie_watson)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMeuComp: String? = MyApp.getInstance().resources.getString(R.string.lbl_meucomp)

)
