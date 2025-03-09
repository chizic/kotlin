fun main(){
    val secretN = listOf(1,2,3,4,5)
    val number = secretN.random()
    println(number)

    print("Digite um número entre 1 e 5: ")
    val guess = readln().toInt()
    if (guess == number) println("Você acertou o chute")
    else println("Você errou o chute")
}