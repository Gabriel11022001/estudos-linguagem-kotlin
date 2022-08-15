package com.gabriel.estudoskotlin.classes

class ContaCorrente(
    nomeTitular: String,
    numeroConta: Int
) : Conta(
    nomeTitular = nomeTitular,
    numeroConta = numeroConta
) {

    override fun sacar(valor: Double) {
        if (valor < 0 || valor > super.saldo) {
            println("Você não pode sacar esse valor!")
            return
        }
        super.saldo = super.saldo - (valor + 10.0);
        println("Saque realizado com sucesso!")
    }
}