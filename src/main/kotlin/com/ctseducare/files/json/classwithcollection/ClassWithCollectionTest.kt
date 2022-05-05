package com.ctseducare.files.json.classwithcollection

import com.google.gson.Gson

fun main() {

  val cwc = ClassWithCollection(
    "Class with collection",
    listOf(
      SimpleClass(1, "SimpleClass 01",  2),
      SimpleClass(2, "SimpleClass 02",  4),
      SimpleClass(3, "SimpleClass 03",  6)
    )
  )
  val jsonClassWithCollection = Gson().toJson(cwc)
  println(jsonClassWithCollection)

  val cwcDES = Gson().fromJson(jsonClassWithCollection, ClassWithCollection::class.java)
  for (so in cwcDES.value2) {
    println(so.value1.toString() + ", " + so.value2 + ", " + so.value3)
  }

}
