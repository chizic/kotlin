/*crie um algoritmo que leia o nome e as duas notas de um aluno,
calcule a sua média e mostre na tela. no final, analise
a média e mostre se o aluno teve ou não um bom aproveitamento ( se ficou acima da média 7.0*/

fun main() {
    print("Qual é o seu nome? ")
    val nome = readln()
    print("Digite a primeira nota: ")
    val nota1 = readln().toFloat()
    print("Digite sua segunda nota: ")
    val nota2 = readln().toFloat()

    val media = (nota1 + nota2) / 2
    println("A sua média é $media")

    if (media >= 7) {
        println("Você teve um bom aproveitamento e está acima da média!")
    }
    else {
        println("Você teve um mal aproveitamento e está abaixo da média!")
    }


}


