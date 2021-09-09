import kotlin.system.measureNanoTime
import kotlin.system.measureTimeMillis

fun main (){

    val nombre = "KEVIN MOLINA"
    val edad = 24
  //                          0           1       2         3
    val nombres = listOf("AGUSTIN", "ALEXIS", "DAFNE", "LETICIA")
    //                  0   1   2   3
    val edades = listOf(21, 22, 25, 23)

    val tiempoForEach = measureNanoTime {



        nombres.forEach {
            println("forEach: $it")
        }


    }
    println("(Tiempo ForEach $tiempoForEach ns)")


    val tiempoWhile = measureNanoTime  {

        var contador = 0
        val n = nombres.size

        while (contador < n){
            println("while: ${nombres[contador]}")
            contador += 1
        }

    }
    println("(Tiempo While $tiempoWhile ms)")



    val tiempoFor= measureNanoTime {
        val n = nombres.size
        for (contador in 0..n){
            if (contador < n){
                println("for: ${nombres[contador]}")
            }
        }
    }
    println("(Tiempo For $tiempoFor ms)")


    println("FIN DEL PROGRAMA")


}
