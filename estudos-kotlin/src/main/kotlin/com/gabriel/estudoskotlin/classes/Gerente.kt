package com.gabriel.estudoskotlin.classes

class Gerente(
    nome: String,
    rg: String,
    cpf: String
) : Funcionario(
    nome = nome,
    rg = rg,
    cpf = cpf
) {

    override fun calcularBonificacao(): Double {
        return super.salario * (0.54)
    }
    override fun apresentarDados() {
        println("Apresentando os dados do gerente:")
        super.apresentarDados()
    }
}