package dev.bruandreo.arrayKt.lists

fun main() {
    val livro1 = Livro(
        titulo = "Grande Sertão: Veredas",
        autor = "João Guimarães Rosa",
        anoPublicacao = 1956
    )

    val livro2 = Livro(
        titulo = "Minha vida de menina",
        autor = "Helena Morley",
        anoPublicacao = 1942,
        editora = "Editora A"
    )

    val livro3 = Livro(
        titulo = "Memórias Póstumas de Brás Cubas",
        autor = "Machado de Assis",
        anoPublicacao = 1881
    )

    val livro4 = Livro(
        titulo = "Iracema",
        autor = "José de Alencar",
        anoPublicacao = 1865,
        editora = "Editora B"
    )

    val livros = mutableListOf<Livro>(livro1, livro2, livro3, livro4)

    livros.add(Livro(
        titulo = "Sagarana",
        autor = "João Guimarães Rosa",
        anoPublicacao = 1946
    ))

    livros.print()

    livros.sorted().print()

    livros.sortedBy { it.titulo }.print() // Ordenação por titulo

    livros
        .filter { it.autor.startsWith("J") }
        .sortedBy { it.anoPublicacao }
        .print()
}

fun List<Livro>.print() {
    val textFormated = this.joinToString(separator = "\n") {
        " - ${it.titulo} de ${it.autor} [${it.anoPublicacao}]"
    }
    println(textFormated)
}
