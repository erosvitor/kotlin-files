package com.ctseducare.files.json.simpleclass

import com.google.gson.Gson

fun main() {

  val gson = Gson()

  val simpleClass = SimpleClass(1, "SimpleClass", 2)
  val jsonSimpleClass = gson.toJson(simpleClass)
  println(jsonSimpleClass)

  val simpleClassDES = gson.fromJson(jsonSimpleClass, SimpleClass::class.java)
  println(simpleClassDES.value1)

}
