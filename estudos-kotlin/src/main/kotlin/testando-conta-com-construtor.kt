import com.gabriel.estudoskotlin.contacomconstrutor.Conta

fun main() {
    var conta = Conta("Gabriel", 123)
    conta.depositar(3000.0)
    println(conta)
}