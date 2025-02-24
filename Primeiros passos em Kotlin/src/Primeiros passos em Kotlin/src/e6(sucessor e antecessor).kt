/*7 Faça um programa em Kotlin que leia um número inteiro e mostre o seu antecessor e seu
sucessor.
Ex:
Digite um número: 9
O antecessor de 9 é 8
O sucessor de 9 é 10*/

fun main(){
    println("Digite um número:")
    val num = readln().toInt()
    val antecessor = num -1
    val sucessor = num+1
    println("o antecessor de $num é $antecessor")
    print("O sucessor de $num é $sucessor")
}