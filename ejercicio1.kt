fun main() {

    println("Ingrese la nota 1:")
    val nota1 = readLine()!!.toFloat()
    println("Ingrese la nota 2:")
    val nota2 = readLine()!!.toFloat()
    println("Ingrese la nota 3:")
    val nota3 = readLine()!!.toFloat()
    val prom = (nota1 + nota2 + nota3) / 3
   
    
        if(prom > 3.5 ){
            println("el promedio es superior a $prom, gana la materia")

        }else if (prom > 2.0 && prom <-3.5){
            println("el promedio es $prom, puede recuperar")

        }else{
            println("el promedio es $prom, no gana y no puede recuperar la materia")
        }
}