import java.util.Scanner

fun main() {
    /**
     * Se eu defino que uma variável será (var), eu defino que seu valor pode ser
     * alterado, se eu definir que a variável será (val), seu valor não poderá
     * ser alterado
     */
    var nome = "Pedro"
    nome = "Gabriel"
    val idade = 21
    // idade = 23
    println(nome)
    println(idade)
    /**
     * Em Kotlin, o tipo da variável vai depender do valor
     * a ela atribuido, exemplo, se eu definir que o valor de uma variável
     * será o valor "Gabriel", essa variável serpa do tipo String
     */
    var sobrenome = "Rodrigues"
    var nomeCompleto = nome + " " + sobrenome
    println("Nome completo: " + nomeCompleto)
    // Abaixo, outra forma de concatenar
    nomeCompleto = "$nome $sobrenome"
    println(nomeCompleto)
    val leitorDadosConsole = Scanner(System.`in`)
    var primeiroNumero = 0.0
    var segundoNumero = 0.0
    var soma = 0.0
    println("Informe um número:")
    primeiroNumero = leitorDadosConsole.nextDouble()
    println("Informe o segundo número:")
    segundoNumero = leitorDadosConsole.nextDouble()
    soma = primeiroNumero + segundoNumero
    println("A soma entre $primeiroNumero e $segundoNumero é igual a $soma")
    println("Informe seu nome:")
    nome = leitorDadosConsole.next()
    println("Seu nome é: " + nome)
}