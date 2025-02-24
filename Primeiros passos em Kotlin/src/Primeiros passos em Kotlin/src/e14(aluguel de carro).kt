/*15 A locadora de carros precisa da sua ajuda para cobrar seus serviços. Escreva um
programa em kotlin que pergunte a quantidade de Km percorridos por um carro alugado
e a quantidade de dias pelos quais ele foi alugado. Calcule o preço total a pagar,
sabendo que o carro custa R$ 90,00 por dia e R$ 0,20 por Km rodado.*/

fun main(){
    print("Qual a quantidade de km foi percorrido? ")
    val km = readln().toFloat()

    print("Quantos dias de aluguel? ")
    val dias = readln().toInt()

    val diaria = dias*90
    val precokm = km*0.2
    val paga = diaria+precokm
    val pagaformat = String.format("%.2f", paga)

    println("O preço total a pagar é R$$pagaformat")
}