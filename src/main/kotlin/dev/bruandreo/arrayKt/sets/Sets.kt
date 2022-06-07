package dev.bruandreo.arrayKt.sets

fun main() {
    val assistiramCursoAndroid = mutableSetOf("Alex", "Fran", "Gui", "Maria")
    val assistiramCursoKotlin = mutableSetOf("Alex", "Paulo", "Maria")

    val assistiramAmbos: Set<String> = assistiramCursoAndroid union assistiramCursoKotlin
    println(assistiramAmbos)

    val assistiramAndroidApenas = assistiramCursoAndroid subtract assistiramCursoKotlin
    println(assistiramAndroidApenas)

    val assistiramOsDoisCursos = assistiramCursoAndroid intersect assistiramCursoKotlin
    println(assistiramOsDoisCursos)
}