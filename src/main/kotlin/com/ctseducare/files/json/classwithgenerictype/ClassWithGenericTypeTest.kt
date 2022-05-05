package com.ctseducare.files.json.classwithgenerictype

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

fun main() {

  val classWithGenericType = ClassWithGenericType<Bar>(Bar("value in class with generic type"))

  val barType = object : TypeToken<ClassWithGenericType<Bar>>(){}.type

  val jsonClassWithGenericType = Gson().toJson(classWithGenericType, barType)
  println(jsonClassWithGenericType)

  val classWithGenericTypeDES: ClassWithGenericType<Bar> = Gson().fromJson(jsonClassWithGenericType, barType)
  println(classWithGenericTypeDES.value1InClassWithGenericType.value1)

}
