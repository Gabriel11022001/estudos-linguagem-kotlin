package com.gabriel.estudoskotlin.classes

open class Conta(var nomeTitular: String, var numeroConta: Int) {

    protected var saldo: Double = 0.0

    fun depositar(valor: Double) {
        if (valor <= 0) {
            println("Você não pode depositar R$$valor!")
            return
        }
        this.saldo = this.saldo + valor
        println("Valor de R$$valor depositado com sucesso!")
    }
    open fun sacar(valor: Double) {
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
    @JvmName("getSaldo1")
    fun getSaldo(): Double {
        return this.saldo
    }
    override fun toString(): String {
        return "[titular: ${this.nomeTitular}, saldo: ${this.getSaldo()}, numeroConta: ${this.numeroConta}]"
    }
    fun transferir(contaDestino: Conta, valor: Double) {
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