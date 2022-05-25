package com.ctseducare.files.json

import com.ctseducare.files.json.array.*
import com.google.gson.*
import org.junit.jupiter.api.Test
import kotlin.test.*

class ArrayTest() {

    @Test
    fun arrayToJson() {
        val foos = arrayOf(
            Foo(true, 1, "aaa"),
            Foo(true, 2, "bbb"),
            Foo(true, 3, "ccc")
        )
        val expected = "[{\"active\":true,\"id\":1,\"name\":\"aaa\"},{\"active\":true,\"id\":2,\"name\":\"bbb\"},{\"active\":true,\"id\":3,\"name\":\"ccc\"}]"
        assertEquals(expected, Gson().toJson(foos))
    }

    @Test
    fun jsonToArray() {
        val json = "[{\"active\":true,\"id\":1,\"name\":\"AAA\"},{\"active\":true,\"id\":2,\"name\":\"BBB\"}]"
        val foosArray = Gson().fromJson(json, Array<Foo>::class.java)
        assertNotNull(foosArray)
        assertEquals(2, foosArray.size)
    }

}