package controller

import model.Endereco
import model.Produto

class Transportadora {
    fun transportadoraFectory(
        nome: String,
        cnpj: String,
        telefone: String,
        produto: Produto,
        endereco: Endereco,
    ) = model.Transportadora(
        nome = nome,
        cnpj = cnpj,
        telefone = telefone,
        produto = produto,
        endereco = endereco,
    )
}