fun main() {
    var nome = "Gabriel"
    if (nome == "Gabriel") {
        println("Meu nome é " + nome)
    }
    var numero1 = 12
    if (numero1 >= 12) {
        println("O valor da variável numero1 é maior ou igual a 12!")
    } else {
        println("O valor da variável numero1 é menor que 12!")
    }
    var idade = 21
    var sexo = "Masculino"
    if (idade >= 18 && sexo == "Masculino") {
        println("Você é de maior e é do sexo Masculino!")
    } else if (idade < 18 && sexo == "Masculino") {
        println("Você é de menor e é do sexo Masculino!")
    }
    sexo = "Feminino"
    if (idade >= 18) {
        print("Você é de maior ")
    } else {
        print("Você é de menor ")
    }
    if (sexo.equals("Masculino")) {
        print("e é do sexo Masculino!")
    } else {
        print("e é do sexo Feminino!")
    }
}