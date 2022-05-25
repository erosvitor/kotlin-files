package com.ctseducare.files.json

import com.ctseducare.files.json.classwithcollection.*
import com.google.gson.Gson
import org.junit.jupiter.api.Test
import kotlin.test.*

class ClassWithCollectionTest() {

    @Test
    fun classWithCollectionToJson() {
        val cwc = ClassWithCollection(
            "Class with collection",
            listOf(
                SimpleClass(1, "SimpleClass 01", 2),
                SimpleClass(2, "SimpleClass 02", 4),
                SimpleClass(3, "SimpleClass 03", 6)
            )
        )
        val expected = "{\"value1\":\"Class with collection\",\"value2\":[{\"value1\":1,\"value2\":\"SimpleClass 01\",\"value3\":2},{\"value1\":2,\"value2\":\"SimpleClass 02\",\"value3\":4},{\"value1\":3,\"value2\":\"SimpleClass 03\",\"value3\":6}]}"
        assertEquals(expected, Gson().toJson(cwc))
    }

    @Test
    fun jsonToClassWithCollection() {
        val json = "{\"value1\":\"Class with collection\",\"value2\":[{\"value1\":1,\"value2\":\"SimpleClass 01\",\"value3\":2},{\"value1\":2,\"value2\":\"SimpleClass 02\",\"value3\":4},{\"value1\":3,\"value2\":\"SimpleClass 03\",\"value3\":6}]}"
        val cwc = Gson().fromJson(json, ClassWithCollection::class.java)
        assertNotNull(cwc)
        assertEquals(3, cwc.value2.size)
    }

}
