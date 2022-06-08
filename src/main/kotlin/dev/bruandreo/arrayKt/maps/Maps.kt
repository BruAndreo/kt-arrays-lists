package dev.bruandreo.arrayKt.maps

fun main() {
    val pedidos = mutableMapOf<Int, Double>(Pair(1, 20.0), Pair(2, 34.0), 3 to 50.0)
    println(pedidos)

    for (pedido: Map.Entry<Int, Double> in pedidos) {
        println("Número do pedido: ${pedido.key}")
        println("Valor do pedido: ${pedido.value}")
    }

    pedidos[4] = 70.0
    pedidos.put(5, 80.0)

    pedidos.put(1, 100.0) // Possible update value too

    pedidos.putIfAbsent(6, 50.0) // Verify existence of key

    try {
        val pedido4 = pedidos.getValue(4)
        println(pedido4)
    } catch (e: NoSuchElementException) {
        println(e.message)
    }

    pedidos.getOrElse(0, { "Pedido não encontrado" })

    pedidos.getOrDefault(1, 0.0)

    println(pedidos.keys)
    println(pedidos.values)

    pedidos.filter { (numero: Int, valor: Double) -> numero % 2 == 0 && valor > 50.0 }

    pedidos.filterValues { valor -> valor > 70.0 }

    pedidos.filterKeys { numero -> numero % 2 == 0 }


}
