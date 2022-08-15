package com.gabriel.exercicios.exercicio2

import java.util.Scanner

fun main() {

    var a: Double = 0.0;
    var b: Double = 0.0;
    var c: Double = 0.0;
    var r: Double = 0.0;
    var s: Double = 0.0;
    var d: Double = 0.0;
    var leitor: Scanner = Scanner(System.`in`)
    println("Informe o valor de a:")
    a = leitor.nextDouble()
    println("Informe o valor de b:")
    b = leitor.nextDouble()
    println("Informe o valor de c:")
    c = leitor.nextDouble()
    r = (a + b) * (a + b)
    s = (b + c) * (b + c)
    d = (r + s) / 2
    println("O valor de d é igual a: $d")
}