import com.gabriel.estudoskotlin.classes.Conta
import com.gabriel.estudoskotlin.classes.ContaCorrente

fun main() {

    var contaCorrente: Conta = ContaCorrente("Gabriel", 122)
    contaCorrente.depositar(3000.0)
    contaCorrente.sacar(100.0)
    println(contaCorrente)
}