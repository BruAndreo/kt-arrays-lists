package dev.bruandreo.arrayKt.collections

fun main() {
    val banco = BancoDeNomes()
    banco.addNome("Bruno")
    println(banco.nomes)
}

class BancoDeNomes {
    companion object {
        private val dados = mutableListOf<String>()
    }

    // Collection is read-only
    val nomes: Collection<String> get() = dados.toList()

    fun addNome(nome: String) {
        dados.add(nome)
    }
}
