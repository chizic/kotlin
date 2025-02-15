/*13 Crie um programa em Kotlin que leia o preço de um produto, calcule e mostre o
seu PREÇO PROMOCIONAL, com 5% de desconto.*/

fun main(){
    print("Qual o preço do produto? ")
    val preco = readln().toFloat()
    val desc = preco *0.05
    val valordesc = preco - desc
    println("O valor promocional do produto é $valordesc")

}