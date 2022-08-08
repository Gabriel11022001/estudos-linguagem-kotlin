import com.gabriel.estudoskotlin.classes.Diretor

fun main() {

    var diretor: Diretor = Diretor(
        "Gabriel",
        "123.456.789-99",
        "56.765.555-98"
    )
    diretor.salario = 4500.0
    var bonificacaoDiretor: Double = diretor.calcularBonificacao()
    println(diretor)
    println("Bonificação do diretor: R$$bonificacaoDiretor")
}