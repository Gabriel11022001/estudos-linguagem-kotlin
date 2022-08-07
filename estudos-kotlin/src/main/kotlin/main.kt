fun main() {
    // Em Kotlin eu posso terminar a instruções com (;) ou não
    println("Olá Mundo!")
    val nome = "Gabriel Rodrigues dos Santos"
    println("Meu nome é " + nome)
    val idade = 21
    val peso = 87.98
    val sexo = "Masculino"
    val possuiCnh = true;
    println("Possuo " + idade + " anos de idade!")
    println("Meu peso é de " + peso + "kg")
    println("Meu sexo é: " + sexo)
    if (possuiCnh == true) {
        println("Eu possuo CNH!")
    } else {
        println("Eu não posso CNH!")
    }
    olaMundo()
    val primeiroValor = 12
    val segundoValor = 33
    val soma = somar(primeiroValor, segundoValor)
    println(soma)
}
fun olaMundo() {
    println("Olá Mundo!")
}
fun somar(primeiroValor : Int, segundoValor : Int): Int {
    return primeiroValor + segundoValor;
}