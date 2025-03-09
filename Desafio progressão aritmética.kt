fun main() {
    // Solicitar o primeiro termo e a razão da PA
    print("Digite o primeiro termo da PA: ")
    val primeiroTermo = readln().toInt()

    print("Digite a razão da PA: ")
    val razao = readln().toInt()

    // Calcular e armazenar os 10 primeiros termos da PA
    val pa = IntArray(10) { i -> primeiroTermo + i * razao }

    // Calcular a soma dos termos
    val soma = pa.sum()

    // Exibir os termos da PA e a soma
    println("Os 10 primeiros termos da PA são: ${pa.joinToString(", ")}")
    println("A soma dos termos é: $soma")
}
