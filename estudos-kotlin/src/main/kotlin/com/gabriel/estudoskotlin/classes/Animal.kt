package com.gabriel.estudoskotlin.classes

open class Animal {

    var nome: String = ""
    var sexo: String = ""

    constructor() {}
    constructor(nome: String, sexo: String) {
        this.nome = nome
        this.sexo = sexo
    }

    override fun toString(): String {
        return "Nome: ${this.nome}, Sexo: ${this.sexo}"
    }
}