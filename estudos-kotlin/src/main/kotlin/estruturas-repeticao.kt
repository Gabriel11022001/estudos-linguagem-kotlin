import java.util.*

fun main() {
    var i = 0
    while (i < 10) {
        println(i)
        i++
    }
    for (i in 0..10) {
        println(i)
    }
    var nomes = Arrays.asList("Gabriel", "Maria", "Pedro", "Gustavo")
    for (nome in nomes) {
        println(nome)
    }
    var valores = Arrays.asList(12, 6, 3, 66, 123)
    var soma = 0
    for (v in valores) {
        soma = soma + v
    }
    println("Soma: $soma")
    for (i in 6 downTo 0) {
        println(i)
    }
    println("=====================================")
    for (i in 1..22) {
        println(i)
        if (i == 12) {
            println("Saindo...")
            break
        }
    }
}