/*Desenvolva um programa que leia um número inteiro e mostre se ela é par ou impar*/

fun main(){
    print("Digite um número: ")
    val num = readln().toInt()
    if (num % 2 == 0){
        println("O número $num é par! ")
    } else{
        println("O número $num é Impar!")
    }
}