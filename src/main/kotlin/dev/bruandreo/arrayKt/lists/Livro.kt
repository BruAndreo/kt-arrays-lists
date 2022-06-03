package dev.bruandreo.arrayKt.lists

data class Livro (
    val titulo: String,
    val autor: String,
    val anoPublicacao: Long,
    val editora: String? = null
): Comparable<Livro> {
    override fun compareTo(other: Livro): Int {
        return this.anoPublicacao.compareTo(other.anoPublicacao)
    }

    override fun toString(): String {
        return "-> ${this.titulo} de ${this.autor}\n\n"
    }
}
