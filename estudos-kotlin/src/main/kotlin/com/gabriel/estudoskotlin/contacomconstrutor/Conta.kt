package com.gabriel.estudoskotlin.contacomconstrutor

class Conta(var nomeTitular: String, var numeroConta: Int) {

    private var saldo: Double = 0.0

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
        return "[titular: ${this.nomeTitular}, saldo: ${this.getSaldo()}, numeroConta: ${this.numeroConta}]"
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