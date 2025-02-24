/*14 Faça um programa em kotlin que leia o salário de um funcionário, calcule e mostre o
seu novo salário, com 15% de aumento.*/

fun main(){
    print("Digite o salário: ")
    val salario = readln().toDouble()
    val aumento = salario*0.15
    val salatual= salario+aumento
    println("O salário atualizado com 15% de aumento é R$$salatual")
}