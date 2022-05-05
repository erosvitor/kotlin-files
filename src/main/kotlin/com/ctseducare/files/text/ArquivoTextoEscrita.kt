package com.ctseducare.files.text

import java.io.File

fun main() {

    val file = File("dadoslinguagem.txt")
    file.printWriter().use { buffer ->
        buffer.println("Linguagem Kotlin")
        buffer.println("1995")
        buffer.println("James Gosling")
    }

    val file2 = File("linuxdistros.txt")
    file2.bufferedWriter().use { buffer ->
        buffer.write("Slackware\n")
        buffer.write("Debian\n")
        buffer.write("Red Hat")
    }

}