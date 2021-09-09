import kotlin.system.measureNanoTime
import kotlin.system.measureTimeMillis

fun main(){

    // O(1) - Constante
    // O(n) - Lineal
    // O(n^2) - Cuadratica

    val tiempo = measureNanoTime {

        val nombre = "KEVIN MOLINA"   // O(1)
        val edad = 24  // O(1)
        //
        val nombres = listOf("AGUSTIN", "ALEXIS", "DAFNE", "LETICIA", "ANTONIO", "ANGEL")  // O(1)
        //
        val edades = listOf(21, 22, 25, 23)  // O(1)


            // O(n^2) - Cuadratica
            nombres.forEach { nombre ->

                edades.forEach { edad ->
                    println("forEach: Nombre: $nombre\nEdad:$edad") // O(1)

                }


            }
    }
    println(tiempo)
}