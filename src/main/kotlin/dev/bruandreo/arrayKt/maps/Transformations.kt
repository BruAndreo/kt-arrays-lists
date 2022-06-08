package dev.bruandreo.arrayKt.maps

fun main() {
    val pedidos = listOf<Pedido>(
        Pedido(1, 20.0),
        Pedido(2, 60.0),
        Pedido(3, 30.0),
        Pedido(4, 70.0)
    )

    val pedidosMapeados = pedidos.associate { pedido -> Pair(pedido.numero, pedido.valor) }
    println(pedidosMapeados)

    val pedidosMapeadosBy: Map<Int, Pedido> = pedidos.associateBy { pedido -> pedido.numero }
    println(pedidosMapeadosBy)

    val pedidosFreteGratis: Map<Pedido, Boolean> = pedidos.associateWith { pedido -> pedido.valor > 50.0 }
    println(pedidosFreteGratis)
    println(pedidosFreteGratis[Pedido(2, 60.0)])

    val pedidosFreteOtherWay: Map<Boolean, List<Pedido>> = pedidos.groupBy { pedido -> pedido.valor > 50.00 }
    println(pedidosFreteOtherWay)
    println("Pedidos com frete gratis ${pedidosFreteOtherWay[true]}")
    println("Pedidos sem frete gratis ${pedidosFreteOtherWay[false]}")
}

data class Pedido(val numero: Int, val valor: Double)