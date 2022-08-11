import com.gabriel.estudoskotlin.classes.Calculadora
import java.util.Scanner

fun menu() {

    println("Informe qual operação você deseja realizar:")
    println("1 - Soma")
    println("2 - Subtração")
    println("3 - Divisão")
    println("4 - Multiplicação")
}
fun main() {

    val entradaUsuario: Scanner = Scanner(System.`in`)
    val calculadora: Calculadora = Calculadora()
    var operacao: Int = -1
    while (operacao < 1 || operacao > 4) {
        menu()
        operacao = entradaUsuario.nextInt()
        if (operacao < 1 || operacao > 4) {
            println("Por gentileza, informe uma opção válida!")
            continue
        }
        println("Informe o primeiro valor:")
        var primeiroValor = entradaUsuario.nextDouble()
        println("Informe o segundo valor:")
        var segundoValor = entradaUsuario.nextDouble()
        if (operacao == 1) {
            println("A soma entre $primeiroValor e $segundoValor é igual a: " + calculadora.somar(primeiroValor, segundoValor))
        }
        if (operacao == 2) {
            println("A subtração de $primeiroValor e $segundoValor é igual a: " + calculadora.subtrair(primeiroValor, segundoValor))
        }
        if (operacao == 3) {
            println("A divisão de $primeiroValor por $segundoValor é igual a: " + calculadora.dividir(primeiroValor, segundoValor))
        }
        if (operacao == 4) {
            println("A multiplicação de $primeiroValor por $segundoValor é igual a " + calculadora.multiplicar(primeiroValor, segundoValor))
        }
    }
}