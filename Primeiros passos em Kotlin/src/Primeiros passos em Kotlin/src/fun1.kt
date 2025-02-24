fun main() {

    var a = 8
    var b = 6
    val result = sum(a, b)
    val subresult = sub(a,b)
    println(result)
    println(subresult)

    if (subresult == 10) {
        println("ok")
    } else {
        print("ala")
    }
}
fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sub(a: Int, b:Int):Int {
    return a - b
    
}



