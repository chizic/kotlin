/*3 Crie um programa que leia o nome e o salário de um funcionário, mostrando no final uma
mensagem.
Ex:
Nome do Funcionário: Maria do Carmo Salário: 1850,45
O funcionário Maria do Carmo tem um salário de R$1850,45 em junho.*/

fun main(){
    println("Qual nome do funcionário?")
    val nome = readln()
    println("Qual o salário?")
    val salario = readln()
    println("O funcionário $nome tem um salário de $salario em junho")
}