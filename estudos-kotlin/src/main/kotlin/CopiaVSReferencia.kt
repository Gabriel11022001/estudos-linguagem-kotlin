fun main() {
    var numeroX = 12
    var numeroY = 33
    println(numeroX)
    println(numeroY)
    numeroX = numeroY
    println(numeroX)
    println(numeroY)
    // referência contaGabriel aponta para um endereço de memória
    var contaGabriel: Conta = Conta()
    contaGabriel.setNomeTitular("Gabriel Rodrigues dos Santos")
    contaGabriel.setNumeroConta(123)
    contaGabriel.depositar(2000.0)
    // referência contaMaria aponta para um endereço de memória
    var contaMaria: Conta = Conta()
    contaMaria.setNomeTitular("Maria Fernanda da silva")
    contaMaria.setNumeroConta(456)
    contaMaria.depositar(500.87)
    println(contaGabriel)
    println(contaMaria)
    // Agora, tanto a referência contaGabriel como contaMaria apontam para o mesmo endereço de memória
    contaMaria = contaGabriel
    println(contaGabriel)
    println(contaMaria)
    contaGabriel.depositar(5000.0)
    println(contaGabriel)
    println(contaMaria)
    contaMaria.depositar(1000.0)
    println(contaGabriel)
    println(contaMaria)
    var contaPedro: Conta = Conta()
    contaPedro.setNomeTitular("Pedro José da Silva")
    contaPedro.setNumeroConta(789)
    var contaGustavo: Conta = Conta()
    contaGustavo.setNomeTitular("Gustavo Pereira da Silva")
    contaGustavo.setNumeroConta(176)
    contaGustavo.depositar(4000.0)
    contaPedro.transferir(contaGustavo, 4000.0)
    contaGustavo.transferir(contaPedro, 2000.0)
    println("Apresentando os dados da conta do Gustavo!")
    println(contaGustavo)
    println("Apresentando os dados da conta do Pedro!")
    println(contaPedro)
}