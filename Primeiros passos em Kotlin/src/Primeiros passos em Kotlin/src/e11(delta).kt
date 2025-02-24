/*12 Desenvolva uma programa em kotlin que leia os valores de A, B e C de uma
equação do segundo grau e mostre o valor de Delta. (formula Δ = b
2 – 4ac)*/

fun main() {
    print("Digite o valor de A: ")
    val aa = readln().toInt()
    print("Digite o valor de B: ")
    val ba = readln().toInt()
    print("Digite o valor de C: ")
    val ce = readln().toInt()
    val de = ba*ba
    val e = 4*aa*ce
    val delta = de-e
    println("O valor do Delta é $delta")
}