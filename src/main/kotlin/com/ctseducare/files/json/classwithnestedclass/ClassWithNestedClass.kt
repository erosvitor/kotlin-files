package com.ctseducare.files.json.classwithnestedclass

import kotlinx.serialization.Serializable

@Serializable
class ClassWithNestedClass {

    @Serializable
    class NestedClass(
        var value1InNestedClass: String
    )

    lateinit var value1: String
    lateinit var value2: NestedClass

}
