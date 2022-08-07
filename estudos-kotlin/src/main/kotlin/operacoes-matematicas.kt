import java.util.Scanner

fun main() {
    var primeiroValor = 0.0
    var segundoValor = 0.0
    var soma = 0.0
    var subtracao = 0.0
    var multiplicacao = 0.0
    var divisao = 0.0
    var restoDivisao = 0.0
    val entrada = Scanner(System.`in`)
    println("Informe o primeiro valor:")
    primeiroValor = entrada.nextDouble()
    println("Informe o segundo valor:")
    segundoValor = entrada.nextDouble()
    // Soma
    soma = primeiroValor + segundoValor
    // Subtração
    subtracao = primeiroValor - segundoValor
    // multiplicação
    multiplicacao = primeiroValor * segundoValor
    // Divisão
    divisao = primeiroValor / segundoValor
    // Resto da divisão
    restoDivisao = primeiroValor % segundoValor
    apresentar(primeiroValor, segundoValor, soma, "+")
    apresentar(primeiroValor, segundoValor, subtracao, "-")
    apresentar(primeiroValor, segundoValor, multiplicacao, "X")
    apresentar(primeiroValor, segundoValor, divisao, "/")
    apresentar(primeiroValor, segundoValor, restoDivisao, "%")
}
fun apresentar(primeiroValor : Double, segundoValor : Double, resultado : Double, operador : String) {
    println("$primeiroValor $operador $segundoValor = $resultado")
}