/*11 Faça um programa em kotlin que leia a largura e altura de uma parede, calcule e
mostre a área a ser pintada e a quantidade de tinta necessária para o serviço,
sabendo que cada litro de tinta pinta uma área de 2 metros quadrados.*/

fun main(){
    print("Qual a largura da parede? ")
    val largura = readln().toFloat()
    print("Qual a altura da parede? ")
    val altura = readln().toFloat()
    val area = largura * altura
    val qtdtinta = area/2
    println("A área da parede é $area metros quadrados")
    print("A quantidade de tinta necessária para uma parede de $area metros quadrados é ")
    println("$qtdtinta litos de tinta")

}