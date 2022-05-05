package com.ctseducare.files.json.classwithgenerictype

import kotlinx.serialization.Serializable

@Serializable
class ClassWithGenericType<T>(
  val value1InClassWithGenericType: T
)
