package com.ctseducare.files.json

import com.ctseducare.files.json.simpleclass.*
import com.google.gson.Gson
import org.junit.jupiter.api.Test
import kotlin.test.*

class SimpleClassTest() {

    @Test
    fun simpleClassToJson()  {
        val simpleClass = SimpleClass(1, "SimpleClass", 2)
        val expected = "{\"value1\":1,\"value2\":\"SimpleClass\",\"value3\":2}"
        assertEquals(expected, Gson().toJson(simpleClass))
    }

    @Test
    fun jsonToSimpleClass() {
        val json = "{\"value1\":1,\"value2\":\"SimpleClass\",\"value3\":2}"
        val simpleClass = Gson().fromJson(json, SimpleClass::class.java)
        assertNotNull(simpleClass)
        assertEquals(1, simpleClass.value1)
    }

}
