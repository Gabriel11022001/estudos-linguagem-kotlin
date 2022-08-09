package com.gabriel.estudoskotlin.classes

class CalculadoraBonificacoes {

    private var totalBonificacoes: Double = 0.0

    fun calcularTotalDeBonificacoes(funcionario: Funcionario) {
        totalBonificacoes += funcionario.calcularBonificacao()
        println("bonificação calculada com sucesso!")
        println("Nome do funcionário: ${funcionario.nome}")
    }
    fun getTotalBonificacoes(): Double {
        return this.totalBonificacoes
    }
}