package model

class Fornecedor {
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
        get() = if (field.isNullOrEmpty())"O nome do fornecedor não foi informado!" else field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }

    var email:String? = null
        get() = if (field.isNullOrEmpty())"O email do fornecedor não foi informado" else field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }

    var cpf:String? = null
        get() = if (field.isNullOrEmpty())"O CPF do fornecedor não foi informado!" else field
        set(value) {
            field = if (value?.length == 10) null else value
        }

    var rg:String? = null
        get() = if (field.isNullOrEmpty())"O RG do fornecedor não foi informado" else field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }

    var endereco: Endereco? = null
        set(value) {
            if (value != null) field = value
        }

    var telefone:String? = null
        get() = if (field.isNullOrEmpty())"O telefone do fornecedor não foi informado" else field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }

    override fun toString(): String {
        return  "《 Fornecedor 》\n"+
                "- Nome do fornecedor: $nome\n" +
                "- Email do fornecedor: $email\n" +
                "- CPF do fornecedor: $cpf\n" +
                "- RG do fornecedor: $rg\n" +
                "- Telefone do fornecedor: $telefone\n"+
                "- Dado Adicional:《 Endereço 》$endereco\n";

    }
}