/*10 Faça um programa em Kotlin que leia quanto dinheiro uma pessoa tem na carteira (em
R$) e mostre quantos dólares ela pode comprar. Considere US$1,00 = R$3,45. (ou
cotação atual)*/

fun main(){
    print("Quantos dinheiro tem na sua carteira em reais? ")
    val reais = readln().toDouble()
    val dolares = reais/3.45
    val dolformat = String.format("%.2f", dolares)
    println("Você pode comprar $$dolformat em dolares")
}