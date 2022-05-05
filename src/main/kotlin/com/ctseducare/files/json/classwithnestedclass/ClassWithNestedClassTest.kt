package com.ctseducare.files.json.classwithnestedclass

import com.ctseducare.files.json.classwithnestedclass.ClassWithNestedClass.NestedClass
import com.google.gson.Gson

fun main() {

  val cwnc = ClassWithNestedClass()
  cwnc.value1 = "Class with nested class"
  cwnc.value2 = NestedClass("value1 in nested class")
  val jsonClassWithNestedClass = Gson().toJson(cwnc)
  println(jsonClassWithNestedClass)

  val cwncDES = Gson().fromJson(jsonClassWithNestedClass, ClassWithNestedClass::class.java)
  println(cwncDES.value1 + ", " + cwncDES.value2.value1InNestedClass)

}
