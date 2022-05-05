package com.ctseducare.files.json.array

import com.google.gson.Gson

fun main() {

  val foos = arrayOf(
    Foo(true, 1, "aaa"),
    Foo(true, 2, "bbb"),
    Foo(true, 3, "ccc")
  )

  val foosStr = Gson().toJson(foos)
  println(foosStr)

  val tmp = "[{\"active\":true,\"id\":1,\"name\":\"AAA\"},{\"active\":true,\"id\":2,\"name\":\"BBB\"}]"
  val foosArray = Gson().fromJson(tmp, Array<Foo>::class.java)
  for (foo in foosArray) {
    println(foo.name)
  }

}
