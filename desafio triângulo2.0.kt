fun main() {
    val retas = FloatArray(3) { i ->
        print("Digite o tamanho ${i + 1}/3 da reta do triângulo: ")
        readln().toFloat()
    }
    val (r1, r2, r3) = retas

    if (r1 < r2 + r3 && r2 < r1 + r3 && r3 < r1 + r2) {
        println(
            when {
                r1 == r2 && r2 == r3 -> "As retas $r1, $r2 e $r3 formam um Triângulo Equilátero!"
                r1 == r2 || r1 == r3 || r2 == r3 -> "As retas $r1, $r2 e $r3 formam um Triângulo Isósceles!"
                else -> "As retas $r1, $r2 e $r3 formam um Triângulo Escaleno!"
            }
        )
    } else {
        println("As retas $r1, $r2 e $r3 não podem formar um triângulo!")
    }
}


/*Crie um programa que leia o tamanho de três segmentos de reta.
 Analise seus cumprimentos e diga se é possível formar um triângulo com essas retas.
 Matematicamente, para três segmentos formarem um triângulo,
 o comprimento de cada lado deve ser menor que a soma dos ouros dois.
 Acrescentando o recurso de mostrar que tipo de triângulo será formado:
 Equilátero: Todos os lados iguais
 Isósceles: dois lados iguais
 Escaleno: Todos os lados diferentes*/