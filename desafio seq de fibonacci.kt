fun main() {
    // Solicitar ao usuário o número inicial para a sequência de Fibonacci
    print("Digite o número inicial para a sequência de Fibonacci: ")
    var numAtual = readln().toInt() // Número inicial dado pelo usuário

    // Solicitar ao usuário a quantidade de números da sequência
    print("Quantos números você deseja na sequência? ")
    val quantidade = readln().toInt() // Quantidade de termos da sequência

    // Array para armazenar a sequência de Fibonacci
    val num = IntArray(quantidade)

    // Iniciar os dois primeiros números da sequência
    if (quantidade > 0) num[0] = numAtual // Primeiro número é o número inicial
    if (quantidade > 1) num[1] = numAtual // Segundo número também será o mesmo valor inicial (personalizado)

    // Gerar a sequência de Fibonacci
    for (i in 2 until quantidade) {
        num[i] = num[i - 1] + num[i - 2] // Soma os dois números anteriores
    }

    // Exibir a sequência de Fibonacci
    println("Seq de Fibonacci: ${num.joinToString(", ")}")
}
