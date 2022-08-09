import com.gabriel.estudoskotlin.classes.Gato

fun main() {
    var gato1: Gato = Gato()
    var gato2: Gato = Gato("Gato feio", "Macho")
    gato1.nome = "Bixano"
    gato1.sexo = "Macho"
    println(gato1)
    println(gato2)
}