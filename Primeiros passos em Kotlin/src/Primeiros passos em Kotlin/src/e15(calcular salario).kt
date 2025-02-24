/*16 Crie um programa kotlin que leia o número de dias trabalhados em um mês e mostre o
salário de um funcionário, sabendo que ele trabalha 8 horas por dia e ganha R$25 por
hora trabalhada.*/

fun main(){
    print("Qual a quantidade de dias trabalhadas? ")
    val dias = readln().toInt()
    val horas = dias*8.toDouble()
    val valor = horas*25

    val valformat = String.format("%.2f", valor)
    println("O seu salário para $dias dias trabalhadas é R$$valformat")
}