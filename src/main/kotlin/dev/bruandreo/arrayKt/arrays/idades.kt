package dev.bruandreo.arrayKt

fun main() {
    val idades: IntArray = intArrayOf(10, 12, 18, 33, 40, 67)

    val media: Double = idades.average()
    println("$media")

    val maiores = idades.all { it >= 18 }
    println("Todos maiores? $maiores")

    val algumMaior = idades.any { it >= 18 }
    println("Algum maior de idade? $algumMaior")

    val osMaiores = idades.filter { it >= 18 }
    println("Maiores: $osMaiores")

    val busca = idades.find { it > 18 }
    println("Busca: $busca")
}