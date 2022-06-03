package dev.bruandreo.arrayKt

import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
    val salarios = bigDecimalArrayOf("1500.00", "2000.00", "5000.00", "10000.00")
    println(salarios.contentToString())

    val aumento = "1.1".toBigDecimal()

    val salariosNovos: Array<BigDecimal> = salarios
        .map { salario -> calculaAumento(salario, aumento) }
        .toTypedArray()

    println("Salarios com aumento " + salariosNovos.contentToString())

    val gastoMensal = salariosNovos.sum()
    println("Gasto mensal com salarios: R$$gastoMensal")

    val semestre = 6.toBigDecimal()
    val gastoSemestral = salariosNovos.fold(gastoMensal) { acc, salario ->
        acc + (salario * semestre).setScale(2, RoundingMode.UP)
    }
    println("Gasto semestral com salarios: R$$gastoSemestral")

    val mediaTresMaioresSalarios = salariosNovos
        .sorted() // Ordena do menor para o maior
        .takeLast(3) // obtem os tres ultimos valores
        .toTypedArray() // converte List para Array
        .average() // Calcula média
    println("Média de três maiores salarios R$$mediaTresMaioresSalarios")

    val mediaTresMenoresSalarios = salariosNovos
        .sorted() // Ordena do menor para o maior
        .take(3) // obtem os tres primeiros valores
        .toTypedArray() // converte List para Array
        .average() // Calcula média
    println("Média de três menores salarios R$$mediaTresMenoresSalarios")
}

fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal> {
    return Array<BigDecimal>(valores.size) { i -> valores[i].toBigDecimal() }
}

fun calculaAumento(salario: BigDecimal, aumento: BigDecimal): BigDecimal {
    return if (salario < "5000".toBigDecimal()) salario + 500.toBigDecimal()
    else (salario * aumento).setScale(2, RoundingMode.UP)
}

fun Array<BigDecimal>.sum(): BigDecimal {
    return this.reduce { acc, valor -> acc + valor }
}

fun Array<BigDecimal>.average(): BigDecimal {
    return if (this.isEmpty()) {
        BigDecimal.ZERO
    } else {
        this.sum() / this.size.toBigDecimal()
    }
}
