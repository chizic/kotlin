/* um programa que permite jogar pedra papel tesoura*/

fun main(){

    val robot = listOf("pedra", "papel", "tesoura")
    val robo =robot.random()
    val opcoes =  mapOf("1" to "pedra", "2" to "papel", "3" to "tesoura")
    var tentativa = 1
    var vcgan = 0
    var rbgan= 0

    while (tentativa < 4) {
        println("Rodada $tentativa")

        print(
            "Digite:\n" +
                    "[1] para Pedra\n" +
                    "[2] para Papel\n" +
                    "[3] para tesoura\n" +
                    "~~~~robo~~~~"
        )

        println(robo)
        print("voce: ")
        val opcao = readln()
        println("~~~~${opcoes[opcao]}~~~~")

        val robogan = (opcao == "1" && robo == "papel") || (opcao == "2" && robo == "tesoura")
                || (opcao == "3" && robo == "pedra")
        val vocegan = (opcao == "1" && robo == "tesoura") || (opcao == "2" && robo == "pedra")
                || (opcao == "3" && robo == "papel")

        if (opcoes[opcao] == robo) println("Empate!")
        if (robogan) {
            println("ponto pro robô! você escolheu ${opcoes[opcao]}.")
            rbgan += 1
        }
        else if (vocegan) {
            println("ponto para você! você escolheu ${opcoes[opcao]}.")
            vcgan += 1
        }

        tentativa+=1
    }
    if (vcgan > rbgan) println("Você ganhou o jogo!!")
    else println("O robô ganhou o jogo!!")

}