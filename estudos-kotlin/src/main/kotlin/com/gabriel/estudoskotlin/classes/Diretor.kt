package com.gabriel.estudoskotlin.classes

class Diretor(
    nome: String,
    cpf: String,
    rg: String
) : Funcionario(nome = nome, cpf = cpf, rg = rg) {

    override fun calcularBonificacao(): Double {
        return super.salario * (0.4)
    }
    override fun apresentarDados() {
        println("Apresentando os dados do diretor:")
        super.apresentarDados()
    }
}