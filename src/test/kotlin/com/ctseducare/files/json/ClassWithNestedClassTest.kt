package com.ctseducare.files.json

import com.ctseducare.files.json.classwithnestedclass.*
import com.ctseducare.files.json.classwithnestedclass.ClassWithNestedClass.NestedClass
import com.google.gson.Gson
import org.junit.jupiter.api.Test
import kotlin.test.*

class ClassWithNestedClassTest() {

    @Test
    fun classWithNestedClassToJson() {
        val cwnc = ClassWithNestedClass()
        cwnc.value1 = "Class with nested class"
        cwnc.value2 = NestedClass("value1 in nested class")
        val expected = "{\"value1\":\"Class with nested class\",\"value2\":{\"value1InNestedClass\":\"value1 in nested class\"}}"
        assertEquals(expected, Gson().toJson(cwnc))
    }

    @Test
    fun jsonToClassWithNestedClass() {
        val json = "{\"value1\":\"Class with nested class\",\"value2\":{\"value1InNestedClass\":\"value1 in nested class\"}}"
        val cwnc = Gson().fromJson(json, ClassWithNestedClass::class.java)
        assertNotNull(cwnc)
        assertEquals("Class with nested class", cwnc.value1)
    }

}
