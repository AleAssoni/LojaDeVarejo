package model

class Endereco {
    constructor(numero: String,
                rua: String,
                bairro: String,
                cidade: String,
                estado: String,
                cep: String,
    ){
        this.numero = numero
        this.rua = rua
        this.bairro = bairro
        this.cidade = cidade
        this.estado = estado
        this.cep = cep
    }

    var numero: String? = null
        get() = if (field.isNullOrEmpty()) "O número não foi informado!" else field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }
    var rua: String? = null
        get() = if (field.isNullOrEmpty()) "A rua não foi informada!" else field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }

    var bairro: String? = null
        get() = if (field.isNullOrEmpty()) "O bairro não foi informado!" else field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }

    var cidade: String? = null
        get() = if (field.isNullOrEmpty()) "A cidade não foi informada!" else field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }

    var estado: String? = null
        get() = if (field.isNullOrEmpty()) "O Estado não foi informado!" else field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }

    var cep: String? = null
        get() = if (field.isNullOrEmpty()) "O CEP não foi informado!" else field
        set(value) {
            field = if (value?.length == 8) value else null
        }

    override fun toString(): String {
        return  "\n- Número da moradia: $numero\n" +
                "- Rua: $rua\n" +
                "- Bairro: $bairro\n" +
                "- Cidade: $cidade\n" +
                "- Estado: $estado\n" +
                "- CEP: $cep";
    }
}