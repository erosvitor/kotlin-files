package com.ctseducare.files.json.classwithcollection

import kotlinx.serialization.Serializable
import kotlinx.serialization.Transient

@Serializable
data class SimpleClass(
    var value1: Int,
    var value2: String,
    @Transient var value3: Int = 0 // 'transient' faz com que o atributo não seja serializado
)
