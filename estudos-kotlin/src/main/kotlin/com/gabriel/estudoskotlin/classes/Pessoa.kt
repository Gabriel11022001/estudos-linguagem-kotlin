package com.gabriel.estudoskotlin.classes

class Pessoa(
    var nome: String,
    var idade: Int,
    var sexo: String
) {

    @Override
    override fun toString(): String {
        return "[\n    Nome: ${this.nome}\n    Idade: ${this.idade}\n    Sexo: ${this.sexo}\n]"
    }
}