/*Faça um programa que permita jogar Pedra papel tisoura*/

fun main() {
    val opcoes = mapOf("1" to "pedra", "2" to "papel", "3" to "tesoura")
    val robo = opcoes.values.random()
    var tentativa = 1
    var pontoUser = 0
    var pontoRobo = 0

    while (tentativa < 4) {

        print(
            """
        ~~~~Rodada $tentativa~~~~
        [1] para Pedra [2] para Papel [3] para Tesoura
        ~~~~Digite:
    """.trimIndent()
        )

        val escolhaUsuario = opcoes[readln()] ?: return println("Opção inválida!")
        println("Robô escolheu: $robo")
        println("Você escolheu: $escolhaUsuario")
        tentativa += 1

        when {
            escolhaUsuario == robo -> println("Empate!")
            (escolhaUsuario == "pedra" && robo == "tesoura") ||
                    (escolhaUsuario == "papel" && robo == "pedra") ||
                    (escolhaUsuario == "tesoura" && robo == "papel") -> {
                println("Você venceu!")
                pontoUser += 1 }

            else -> {
                println("O robô venceu!")
                pontoRobo += 1
            }
        }
    }
    if (pontoUser > pontoRobo) println("Você ganhou o jogo!!")
    else if (pontoRobo > pontoUser) println("O Robô ganhou o jogo!!")
    else println("Jogo empatado!!")
}
