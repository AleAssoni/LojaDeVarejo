package controller

import model.Cliente
import model.Produto
import model.Vendedor

class Venda {
    fun vendaFectory(
        valorTotal: Double,
        notaFiscal: String,
        produto: Produto,
        vendedor: Vendedor,
        cliente: Cliente,
    ) = model.Venda(
        valorTotal = valorTotal,
        notaFiscal = notaFiscal,
        produto = produto,
        vendedor = vendedor,
        cliente = cliente,
    )
}