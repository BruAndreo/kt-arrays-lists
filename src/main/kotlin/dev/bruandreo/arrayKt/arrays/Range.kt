package dev.bruandreo.arrayKt

fun main() {
    val serie: IntRange = 1.rangeTo(10)
    serie.forEach { s -> println("$s") }

    val numerosPares = 0..100 step 2
    numerosPares.forEach { num -> println("$num") }

    val numerosParesReversos = 100 downTo 2 step 2
    numerosParesReversos.forEach { println("$it") }

}