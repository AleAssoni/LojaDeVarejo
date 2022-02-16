package controller

import model.Endereco

class Vendedor {
    fun vendedorFectory(
        nome: String,
        email: String,
        cpf: String,
        rg: String,
        endereco: Endereco,
        telefone: String,
        filial: String,

        ) = model.Vendedor(
        nome = nome,
        email = email,
        cpf = cpf,
        rg = rg,
        endereco = endereco,
        telefone = telefone,
        filial = filial,
    )
}