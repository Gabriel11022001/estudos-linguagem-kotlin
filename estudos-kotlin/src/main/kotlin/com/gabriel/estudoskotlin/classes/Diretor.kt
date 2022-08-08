package com.gabriel.estudoskotlin.classes

class Diretor(
    nome: String,
    cpf: String,
    rg: String
) : Funcionario(nome = nome, cpf = cpf, rg = rg) {

    override fun calcularBonificacao(): Double {
        return this.salario * (0.4)
    }
}