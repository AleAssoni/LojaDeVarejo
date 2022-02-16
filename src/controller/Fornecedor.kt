package controller

import model.Endereco

class Fornecedor {
    fun fornecedorFectory(
        nome: String,
        email: String,
        cpf: String,
        rg: String,
        endereco: Endereco,
        telefone: String,

        ) = model.Fornecedor(
        nome = nome,
        email = email,
        cpf = cpf,
        rg = rg,
        endereco = endereco,
        telefone = telefone,
    )
}