package controller

class Endereco {
    fun enderecoFectory(
        numero: String,
        rua: String,
        bairro: String,
        cidade: String,
        estado: String,
        cep: String,
    ) = model.Endereco(
        numero = numero,
        rua = rua,
        bairro = bairro,
        cidade = cidade,
        estado = estado,
        cep = cep,
    )
}