package com.meucomp.app.modules.schedule.`data`.model

import com.meucomp.app.R
import com.meucomp.app.appcomponents.di.MyApp
import kotlin.String

data class ScheduleRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_11_35)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_13_05)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSentiansiedade: String? =
      MyApp.getInstance().resources.getString(R.string.msg_pensamento_disf)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_pensamento_x_oc)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmcasa: String? = MyApp.getInstance().resources.getString(R.string.lbl_em_casa)

)
