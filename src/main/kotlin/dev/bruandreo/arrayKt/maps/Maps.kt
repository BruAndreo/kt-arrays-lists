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
}
