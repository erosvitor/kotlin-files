package com.ctseducare.files.json.simpleclass

import kotlinx.serialization.Serializable

@Serializable
data class SimpleClass (
  val value1: Int,
  val value2: String,
  @Transient val value3: Int // 'transient' faz com que o atributo não seja serializado
)
