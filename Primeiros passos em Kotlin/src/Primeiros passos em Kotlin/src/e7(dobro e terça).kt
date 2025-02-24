/*8 Crie um programa em Kotlin que leia um número real e mostre na tela o seu dobro
e a sua terça parte.
Ex: Digite um número: 3.5
O dobro de 3.5 é 7.0
A terça parte de 3.5 é 1.16666*/

fun main(){
    print("Digite um número: ")
    val num = readln().toDouble()
    val double = num *2
    val terca = num/3
    println("O dobro de $num é $double")
    println("A terça parte de $num é $terca")

}