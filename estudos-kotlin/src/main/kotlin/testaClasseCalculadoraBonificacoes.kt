import com.gabriel.estudoskotlin.classes.CalculadoraBonificacoes
import com.gabriel.estudoskotlin.classes.Diretor
import com.gabriel.estudoskotlin.classes.Funcionario

fun main() {

    var funcionario1: Funcionario = Diretor(
        "Gabriel",
        "123.456.789-99",
        "45.678.098-98"
    )
    funcionario1.salario = 4500.0
    var funcionario2: Funcionario = Diretor(
        nome = "Maria",
        cpf = "134.567.987-09",
        rg = "76.876.443-98"
    )
    funcionario2.salario = 12000.0
    var calculadoraBonificacoes: CalculadoraBonificacoes = CalculadoraBonificacoes()
    calculadoraBonificacoes.calcularTotalDeBonificacoes(funcionario1)
    calculadoraBonificacoes.calcularTotalDeBonificacoes(funcionario2)
    println("total de bonificações: R$${calculadoraBonificacoes.getTotalBonificacoes()}")
}