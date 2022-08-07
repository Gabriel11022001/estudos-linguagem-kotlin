class Conta {

    /**
     * Em Kotlin, eu sempre devo inicializar os valores das propriedades
     * dos objetos
     */
    private var nomeTitular: String = ""
    private var saldo: Double = 0.0
    private var numeroConta: Int = 0

    public fun setNomeTitular(nomeTitular: String) {
        this.nomeTitular = nomeTitular
    }
    public fun getNomeTitular(): String {
        return this.nomeTitular
    }
    public fun setNumeroConta(numeroConta: Int) {
        this.numeroConta = numeroConta
    }
    public fun getNumeroConta(): Int {
        return this.numeroConta
    }
    public fun depositar(valor: Double) {
        if (valor <= 0) {
            println("Você não pode depositar R$$valor!")
            return
        }
        this.saldo = this.saldo + valor
        println("Valor de R$$valor depositado com sucesso!")
    }
    public fun sacar(valor: Double) {
        if (valor <= 0) {
            println("Você não pode sacar R$$valor")
            return
        }
        if (valor > this.saldo) {
            println("Saldo insuficiente!")
            return
        }
        this.saldo -= valor
        println("Saque realizado com sucesso!")
    }
    public fun getSaldo(): Double {
        return this.saldo
    }
    override fun toString(): String {
        return "[titular: ${this.getNomeTitular()}, saldo: ${this.getSaldo()}, numeroConta: ${this.getNumeroConta()}]"
    }
    public fun transferir(contaDestino: Conta, valor: Double) {
        if (valor <= 0) {
            println("Você não pode transferir R$$valor")
            return
        }
        if (valor > this.getSaldo()) {
            println("Saldo insuficiente!")
            return
        }
        contaDestino.depositar(valor)
        this.saldo -= valor
    }
}