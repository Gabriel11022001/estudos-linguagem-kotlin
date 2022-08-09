import com.gabriel.estudoskotlin.classes.Diretor
import com.gabriel.estudoskotlin.classes.Funcionario
import com.gabriel.estudoskotlin.classes.Gerente
import java.lang.RuntimeException

fun main() {

    try {
        var funcionario1: Funcionario = Gerente(
            "Gabriel",
            "123.456.789-00",
            "56.123.456-98"
        )
        // funcionario1.salario = 0.0
        funcionario1.salario = 4500.0
        var bonificacaoFuncionario1: Double = funcionario1.calcularBonificacao()
        println(funcionario1)
        println("Bonificação do funcionário 1: R$$bonificacaoFuncionario1")
        var funcionario2: Funcionario = Diretor(
            nome = "Pedro",
            cpf = "123.765.444-98",
            rg = "65.123.456.87"
        )
        funcionario2.salario = 3450.0
        var bonificacaoFuncionario2: Double = funcionario2.calcularBonificacao()
        println(funcionario2)
        println("Bonificação do funcionário 2: R$$bonificacaoFuncionario2")
        println("============================================================")
        funcionario1.apresentarDados()
        funcionario2.apresentarDados()
    } catch (e: RuntimeException) {
        println(e.message)
    }
}