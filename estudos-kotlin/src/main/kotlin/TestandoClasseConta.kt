fun main() {
    var conta1 = Conta()
    // conta1.nomeTitular = "Gabriel Rodrigues dos Santos"
    // conta1.saldo = 5000.0
    // conta1.numeroConta = 1234
    // println("Nome do titular: ${conta1.nomeTitular}")
    // println("Saldo da conta: R$${conta1.saldo}")
    // println("Número da conta: ${conta1.numeroConta}")
    conta1.setNomeTitular("Gabriel Rodrigues dos Santos")
    conta1.setNumeroConta(1234)
    conta1.depositar(450.0)
    conta1.depositar(234.66)
    conta1.depositar(4000.00)
    println("Saldo da conta: R$${conta1.getSaldo()}")
    conta1.sacar(3000.0)
    println("Saldo da conta: R$${conta1.getSaldo()}")
    println(conta1)
}