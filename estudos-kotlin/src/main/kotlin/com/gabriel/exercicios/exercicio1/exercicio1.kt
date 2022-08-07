package com.gabriel.exercicios.exercicio1

import java.util.Scanner

fun main() {

    val leitor = Scanner(System.`in`)
    var primeiranota = 0.0
    var segundaNota = 0.0
    var terceiranota = 0.0
    var media = 0.0
    println("Informe a primeira nota do aluno:")
    primeiranota = leitor.nextDouble()
    println("Informe a segunda nota do aluno:")
    segundaNota = leitor.nextDouble()
    println("Informe a terceira nota do aluno:")
    terceiranota = leitor.nextDouble()
    media = CalculaMediaSemestre().calcularMedia(primeiranota, segundaNota, terceiranota)
    println("A média desse aluno é igual a : " + media)
    if (media >= 6) {
        println("Aprovado!")
    } else {
        println("Reprovado!")
    }
}