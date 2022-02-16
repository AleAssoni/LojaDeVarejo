import model.*

fun main() {

    //Dados do Cliente
    val cliente = controller.Cliente()
    val clienteUm = cliente.clienteFectory(
        nome = "Alexandre Assoni",
        email = "Alezin@gmail.com",
        cpf = "12345678901",
        rg = "123456789",
        telefone = "(051)98002-8922",
        endereco = Endereco(
            numero = "02",
            rua = "Batista Fontana",
            bairro = "Rubem Berta",
            cidade = "Porto Alegre",
            estado = "RS",
            cep = "91150000",
        )
    )

    //Dados do Fornecedor
    val fornecedor = controller.Fornecedor()
    val fornecedorUm = fornecedor.fornecedorFectory(
        nome = "Juan Barcellos",
        email = "JuanDaAcad@gmail.com",
        cpf = "10987654321",
        rg = "987654321",
        telefone = "(051)99659-7259",
        endereco = Endereco(
            numero = "24",
            rua = "Av Farrapos",
            bairro = "Centro",
            cidade = "Porto Alegre",
            estado = "RS",
            cep = "85640000",
        )
    )

    //Dados do Produto
    val produto = controller.Produto()
    val produtoUm = produto.produtoFectory(
        peso = 50.0,
        id = "0001",
        marca = "Anilhas Brasil",
        preco = 299.99,
    )

    //Dados da Transportadora
    val transportadora = controller.Transportadora()
    val transportadoraUm = transportadora.transportadoraFectory(
        nome = "TransGuilherme",
        cnpj = "1234567890",
        telefone = "(051)0800-3254",
        produto = Produto(
            peso = 50.0,
            id = "0001",
            marca = "Anilhas Brasil",
            preco = 100.99,
        ),
        endereco = Endereco(
            numero = "534",
            rua = "Dr Euclides da cunha",
            bairro = "Passo das pedras",
            cidade = "Porto Alegre",
            estado = "RS",
            cep = "97310000",)
    )

    //Dados da Venda
    val venda = controller.Venda()
    val vendaUm = venda.vendaFectory(
        valorTotal = 100.99,
        notaFiscal = "019",
        produto = Produto(
            peso = 50.0,
            id = "0001",
            marca = "Anilhas Brasil",
            preco = 100.99,
        ),
        vendedor = Vendedor(
            nome = "Andrei Miranda",
            email = "AndreiDelas@gmail.com",
            cpf = "56734218902",
            rg = "742324706",
            telefone = "(051)98062-7215",
            filial = "Loja Assis Brasil",
            endereco = Endereco(
                numero = "35",
                rua = "Norberto Mendes",
                bairro = "Passo da figueira",
                cidade = "Alvorada",
                estado = "RS",
                cep = "65470000",
            )
        ),
        cliente = Cliente(
            nome = "Alexandre Assoni",
            email = "Alezin@gmail.com",
            cpf = "12345678901",
            rg = "123456789",
            telefone = "(051)98002-8922",
            endereco = Endereco(
                numero = "02",
                rua = "Batista Fontana",
                bairro = "Rubem Berta",
                cidade = "Porto Alegre",
                estado = "RS",
                cep = "91150000",
            )
        )
    )

    //Dados do Vendedor
    val vendedor = controller.Vendedor()
    val vendedorUm = vendedor.vendedorFectory(
        nome = "Andrei Miranda",
        email = "AndreiDelas@gmail.com",
        cpf = "56734218902",
        rg = "742324706",
        telefone = "(051)98062-7215",
        filial = "Loja Assis Brasil",
        endereco = Endereco(
            numero = "35",
            rua = "Norberto Mendes",
            bairro = "Passo da figueira",
            cidade = "Alvorada",
            estado = "RS",
            cep = "65470000",
        )
    )

    println(clienteUm)
    println(fornecedorUm)
    println(produtoUm)
    println(transportadoraUm)
    println(vendaUm)
    println(vendedorUm)

}