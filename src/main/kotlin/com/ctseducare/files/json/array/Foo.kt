package com.ctseducare.files.json.array

import kotlinx.serialization.Serializable

@Serializable
data class Foo(
    val active: Boolean,
    val id: Int,
    val name: String
)
