package com.meucomp.app.firestore.models

import com.google.firebase.firestore.PropertyName
import kotlin.String
import kotlin.jvm.JvmField

public class Info {
  @JvmField
  @PropertyName("nome")
  public var nome: String? = null

  @JvmField
  @PropertyName("sobrenome")
  public var sobrenome: String? = null
}
