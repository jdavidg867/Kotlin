
fun main(){
//Haga un algoritmo que solicite n cantidad de números hasta que el usuario ingrese el número 5

var numero = 0
do {
print("Ingrese un número: ")
numero = readLine()!!.toInt()
} while (numero != 5)
println("Ha ingresado el número 5.")

}