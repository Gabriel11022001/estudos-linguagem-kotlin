package com.gabriel.estudoskotlin.classes

import java.lang.RuntimeException

/**
 * Sempre que eu quero herdar de uma super classe,
 * eu devo acessar a super classe e definir antes de "class"
 * a palavra reservada "open", possibilitando que qualquer classe possa
 * herdar dessa classe
 */
open class Funcionario(
    var nome: String,
    var cpf: String,
    var rg: String
) {

    var salario: Double = 0.0
        // Set para a propriedade salario
        set(valor) {
            if (valor <= 0.0) {
                throw RuntimeException("O salário do funcionário não deve ser menor ou igual a 0!");
            }
            field = valor
        }
        // Get para a propriedade salario
        get() {
            if (field == 0.0) {
                throw RuntimeException("O valor do salário do funcionário ainda não foi definido!")
            }
            return field
        }

    /**
     * Como eu quero que toda classe que herde de Funcionario possa sobreescrever
     * esse método, eu devo definir que ele é "open", agora esse método pode ser sobreescrito
     * nas classes filhas
     */
    open fun calcularBonificacao(): Double {
        return this.salario * (0.1)
    }
    override fun toString(): String {
        return "Nome: ${this.nome} | Rg: ${this.rg} | Cpf: ${this.cpf} | Salário: R$${this.salario}"
    }
}