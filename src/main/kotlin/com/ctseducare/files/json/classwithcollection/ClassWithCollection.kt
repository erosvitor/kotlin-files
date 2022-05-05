package com.ctseducare.files.json.classwithcollection

import kotlinx.serialization.Serializable

@Serializable
class ClassWithCollection (
  var value1: String,
  var value2: List<SimpleClass>
)