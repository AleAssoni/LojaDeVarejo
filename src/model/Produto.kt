package model

class Produto {
    constructor(peso: Double,
                id: String,
                marca: String,
                preco: Double,
    ){
        this.peso = peso
        this.id = id
        this.marca = marca
        this.preco = preco
    }
    var peso:Double? = null
        set(value) {
            field = if (value!! <= 0 || value!! >= 100) null else value
        }

    var id:String? = null
        get() = if (field.isNullOrEmpty())"O id do produto não foi informado!" else field
        set(value) {
            field = if (value!!.length >= 10) null else value
        }

    var marca:String? = null
        get() = if (field.isNullOrEmpty())"O nome do cliente não foi informado!" else field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }

    var preco:Double? = null
        set(value) {
            field = if (value!! < 0) null else value
        }

    override fun toString(): String {
        return  "《 Produto 》\n"+
                "- Peso do produto: $peso\n" +
                "- Id do produto: $id\n" +
                "- Marca do produto: $marca\n" +
                "- Preço do produto: $preco";

    }
}