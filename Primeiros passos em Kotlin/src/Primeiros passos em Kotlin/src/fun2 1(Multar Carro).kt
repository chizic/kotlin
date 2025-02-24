/*Escreva ym programa que:
pergunte a velocidade de um carro.
caso ultrapasse 80km/h, exiba uma mensagem dizendo que o usuário foi multado.
nesse caso exiba o valor da multa, cobrando R$5 por cada km acima da velocidade permitida.
 */

fun main(){
    print("Qual a velocidade do carro? ")
    val volo = readln().toFloat()

    if (volo > 80){
        val mole = volo - 80
        val koli = 5*mole
        val kolifor = String.format("%.2f", koli)

            println("O carro foi multado com R$$kolifor!")
    } else {
        println("Velocidade ok!")
    }

}