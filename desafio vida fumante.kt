/*17 [DESAFIO] Escreva um programa em kotlin para calcular a redução do tempo de vida
de um fumante. Pergunte a quantidade de cigarros fumados por dias e quantos anos
ele já fumou. Considere que um fumante perde 10 min de vida a cada cigarro. Calcule
quantos dias de vida um fumante perderá e exiba o total em dias.
1440 minutos por dia
525600 minutos por ano*/

fun main(){
    print("qual a quantidade de cigarros fumados no dia? ")
    val cigar = readln().toInt()
    print("Quantos anos de fumo? ")
    val anos = readln().toInt()
    val mins= cigar*10
    val dias = anos*365
    val perde = mins*dias
    val perdsia = perde/1440


    //val dia = 1440
    //val ano = anos*525600

    print("O fumante perderá $perdsia dias de vida ao fumar $cigar " +
            "cigarros por dia durante $anos anos")
}