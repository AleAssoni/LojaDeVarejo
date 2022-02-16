package controller

import model.Endereco

class Cliente {
    fun clienteFectory(
        nome: String,
        email: String,
        cpf: String,
        rg: String,
        endereco: Endereco,
        telefone: String,

        ) = model.Cliente(
        nome = nome,
        email = email,
        cpf = cpf,
        rg = rg,
        endereco = endereco,
        telefone = telefone,
    )
}