package model

class Transportadora {
    constructor(
        nome: String,
        cnpj: String,
        telefone: String,
        produto: Produto,
        endereco: Endereco,
    ){
        this.nome = nome
        this.cnpj = cnpj
        this.telefone = telefone
        this.produto = produto
        this.endereco = endereco
    }

    var nome:String? = null
        get() = if (field.isNullOrEmpty())"O nome da trasnportadora não foi informado!" else field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }

    var cnpj:String? = null
        get() = if (field.isNullOrEmpty())"O CNPJ da transportadora não foi informado!" else field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }

    var telefone:String? = null
        get() = if (field.isNullOrEmpty())"O telefone da transportadora não foi informado!" else field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }

    var produto: Produto? = null
        set(value) {
            if (value != null) field = value
        }

    var endereco: Endereco? = null
        set(value) {
            if (value != null) field = value
        }

    override fun toString(): String {
        return  "\n《 Transportadora 》\n"+
                "- Nome da transportadora: $nome\n" +
                "- CNPJ da transportadora: $cnpj\n" +
                "- Telefone da transportadora: $telefone\n" +
                "- Dado Adicional:$produto" +
                "\n- Dado Adicional:《 Endereço 》$endereco\n" ;

    }
}