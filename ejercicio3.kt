fun main(){
    //Haga un algoritmo que solicite el ingreso de un número e indique si es positivo o negativo

    println("Ingrese un número:")
    val num = readLine()!!.toInt()
    if (num > 0) {
    println("El número es positivo")
    } else {
    println("El número es negativo")
    }
    println("El número es: $num")
       
}