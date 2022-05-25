package com.ctseducare.files.json

import com.ctseducare.files.json.classwithgenerictype.*
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import org.junit.jupiter.api.Test
import kotlin.test.*

class ClassWithGenericTypeTest() {

    private var barType = object : TypeToken<ClassWithGenericType<Bar>>() {}.type

    @Test
    fun classWithGenericTypeToJson() {
        val classWithGenericType = ClassWithGenericType(Bar("value in class with generic type"))
        val expected = "{\"value1InClassWithGenericType\":{\"value1\":\"value in class with generic type\"}}"
        assertEquals(expected, Gson().toJson(classWithGenericType, barType))
    }

    @Test
    fun jsonToClassWithGenericType() {
        val json = "{\"value1InClassWithGenericType\":{\"value1\":\"value in class with generic type\"}}"
        val cwg: ClassWithGenericType<Bar> = Gson().fromJson(json, barType)
        assertNotNull(cwg)
        assertEquals("value in class with generic type", cwg.value1InClassWithGenericType.value1)
    }

}
