package model

class Venda {
    constructor(
        valorTotal: Double,
        notaFiscal: String,
        produto: Produto,
        vendedor: Vendedor,
        cliente: Cliente,
    ){
        this.valorTotal = valorTotal
        this.notaFiscal = notaFiscal
        this.produto = produto
        this.vendedor = vendedor
        this.cliente = cliente
    }
    var valorTotal:Double? = null
        set(value) {
            field = if (value!! < 0) null else value
        }

    var notaFiscal:String? = null
        get() = if (field.isNullOrEmpty())"A nota fiscal da venda não foi informada! " else field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }

    var produto: Produto? = null
        set(value) {
            if (value != null) field = value
        }

    var vendedor: Vendedor? = null
        set(value) {
            if (value != null) field = value
        }

    var cliente: Cliente? = null
        set(value) {
            if (value != null) field = value
        }

    override fun toString(): String {
        return  "《 Venda 》\n"+
                "- Valor total da venda: $valorTotal\n" +
                "- Nota fiscal da venda: $notaFiscal\n" +
                "- Dado Adicional: $produto\n" +
                "- Dado Adicional: $vendedor" +
                "- Dado Adicional: $cliente";
    }
}