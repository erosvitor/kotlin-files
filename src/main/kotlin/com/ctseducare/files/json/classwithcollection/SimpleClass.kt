package com.ctseducare.files.json.classwithcollection

import kotlinx.serialization.Serializable

@Serializable
data class SimpleClass (
  var value1: Int,
  var value2: String,
  @Transient var value3: Int // 'transient' faz com que o atributo não seja serializado
)
