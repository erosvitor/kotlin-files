package com.ctseducare.files.text

import java.io.File

fun main() {

    // Lendo caractere por caractere
    //--------------------------------------------------------------------------------
    val file = File("dadoslinguagem.txt").reader()
    file.use {
        while (true) {
            val c = file.read()
            if (c == -1) break
            print(c.toChar())
        }
    }

    // Lendo linha por linha
    //--------------------------------------------------------------------------------
    val file2 = File("linuxdistros.txt")
    val lines: List<String> = file2.readLines()
    lines.forEach { line -> println(line) }

}