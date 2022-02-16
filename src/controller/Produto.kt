package controller

class Produto {
    fun produtoFectory(
        peso: Double,
        id: String,
        marca: String,
        preco: Double,
    )  = model.Produto(
        peso = peso,
        id = id,
        marca = marca,
        preco = preco,
    )
}