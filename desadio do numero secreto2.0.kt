fun main(){
    val secretN = listOf(1,2,3,4,5,6,7,8,9,10)
    val number = secretN.random()
    var tentativas = 1
   // println(number)

    while (tentativas <= 4) {
        println("~~~~~~Tentativa $tentativas~~~~~~")
        print("Digite um número entre 1 e 10: ")
        val guess = readln().toInt()
        val acertou = guess == number

        if (acertou) {
            println("""Você acertou o chute com $tentativas ${if (tentativas == 1) "tentativa" else "tentativas"} """)
            break
        }

        else {
            println("Você errou o chute")
        }
        tentativas++
        if (tentativas>4) {
            println("Você não acertou em nenhuma das 4 tentativas")
        }

    }

}