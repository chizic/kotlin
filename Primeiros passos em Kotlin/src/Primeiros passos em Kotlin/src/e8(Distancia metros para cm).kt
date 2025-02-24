/*9 Desenvolva um programa em Kotlin que leia uma distância em metros e mostre os
valores relativos em outras medidas.
Ex:
Digite uma distância em metros: 100
Distância de 10000 Cm*/

fun main(){
    print("Digite uma distância em metros: ")
    val distancia = readln().toInt()
    val distanciacm = distancia*100
    println("Distância de $distanciacm cm ")
}