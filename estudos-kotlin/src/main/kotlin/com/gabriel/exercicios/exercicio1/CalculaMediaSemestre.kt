package com.gabriel.exercicios.exercicio1

class CalculaMediaSemestre {

    fun calcularMedia(primeiraNota: Double, segundaNota: Double, terceiraNota: Double): Double {

        var media = (primeiraNota + segundaNota + terceiraNota) / 3;
        return media
    }
}