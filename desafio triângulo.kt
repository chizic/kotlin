import javax.management.Query.and

/*Crie um programa que leia o tamanho de três segmentos de reta.
 Analise seus cumprimentos e diga se é possível formar um triângulo com essas retas.
 Matematicamente, para três segmentos formarem um triângulo,
 o comprimento de cada lado deve ser menor que a soma dos ouros dois.*/

fun main(){
    print("Digite o tamanho 1/3 da reta do triângulo: ")
    val reta1 = readln().toFloat()
    print("Digite o tamanho 2/3 da reta do triângulo: ")
    val reta2 = readln().toFloat()
    print("Digite o tamanho 3/3 da reta do triângulo: ")
    val reta3 = readln().toFloat()

    if (reta1<(reta2+reta3)&&reta2<(reta1+reta3)&&reta3<(reta2+reta1)){
        println("As retas de tamanhos: $reta1, $reta2 e $reta1 podem formar um triângulu!")
    } else{
        println("As retas de tamanhos: $reta1, $reta2 e $reta1 não podem formar um triângulu!")
    }


}