/*Programa que lê o ano de nascimento de uma pessoa,
 calcule a idade e mostra se ela pode ou não votar*/

fun main(){

    print("Qual seu ano de nascimento: ")
    val ano = readln().toInt()
    val anoatual = 2025
    val idade = anoatual - ano
    println("Você tem $idade anos de idade")

    if (idade >= 16) {
        println("Você já pode votar")
    }
    else{
        println("Você ainda não pode votar")
    }

}