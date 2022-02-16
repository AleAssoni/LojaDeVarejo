package model

class Vendedor {
    constructor(nome:String,
                email:String,
                cpf: String,
                rg: String,
                endereco: Endereco,
                telefone: String,
                filial: String,
    ){
        this.nome = nome
        this.email = email
        this.cpf = cpf
        this.rg = rg
        this.endereco = endereco
        this.telefone = telefone
        this.filial = filial
    }

    var nome:String? = null
        get() = if (field.isNullOrEmpty())"O nome do vendedor não foi informado!" else field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }

    var email:String? = null
        get() = if (field.isNullOrEmpty())"O email do vendedor não foi informado" else field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }

    var cpf:String? = null
        get() = if (field.isNullOrEmpty())"O CPF do vendedor não foi informado!" else field
        set(value) {
            field = if (value?.length == 10) null else value
        }

    var rg:String? = null
        get() = if (field.isNullOrEmpty())"O RG do vendedor não foi informado" else field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }

    var endereco: Endereco? = null
        set(value) {
            if (value != null) field = value
        }

    var telefone:String? = null
        get() = if (field.isNullOrEmpty())"O telefone do vendedor não foi informado!" else field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }

    var filial:String? = null
        get() = if (field.isNullOrEmpty())"A filial do vendedor não foi informado!" else field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }

    override fun toString(): String {
        return  "《 Vendedor 》\n"+
                "- Nome do vendedor: $nome\n" +
                "- Email do vendedor: $email\n" +
                "- CPF do vendedor: $cpf\n" +
                "- RG do vendedor: $rg\n" +
                "- Telefone do vendedor: $telefone\n"+
                "- Filial do vendedor: $filial\n"+
                "- Dado Adicional:《 Endereço 》$endereco\n";
    }
}