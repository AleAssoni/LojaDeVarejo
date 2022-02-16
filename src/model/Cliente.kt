package model

class Cliente {
    constructor(nome:String,
                email:String,
                cpf: String,
                rg: String,
                endereco: Endereco,
                telefone: String,
    ){
        this.nome = nome
        this.email = email
        this.cpf = cpf
        this.rg = rg
        this.endereco = endereco
        this.telefone = telefone
    }

    var nome:String? = null
        get() = if (field.isNullOrEmpty())"O nome do cliente não foi informado!" else field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }

    var email:String? = null
        get() = if (field.isNullOrEmpty())"O email do cliente não foi informado" else field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }

    var cpf:String? = null
        get() = if (field.isNullOrEmpty())"O CPF do cliente não foi informado!" else field
        set(value) {
            field = if (value?.length == 10) null else value
        }

    var rg:String? = null
        get() = if (field.isNullOrEmpty())"O RG do cliente não foi informado" else field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }

    var endereco: Endereco
        set(value) {
            if (value != null) field = value
        }

    var telefone:String? = null
        get() = if (field.isNullOrEmpty())"O telefone do cliente não foi informado" else field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }

    override fun toString(): String {
        return  "《 Dados do Cliente 》\n"+
                "- Nome do cliente: $nome\n" +
                "- Email do cliente: $email\n" +
                "- CPF do cliente: $cpf\n" +
                "- RG do cliente: $rg\n" +
                "- Telefone do cliente: $telefone\n"+
                "- Dado Adicional:《 Endereço 》$endereco\n";
    }
}