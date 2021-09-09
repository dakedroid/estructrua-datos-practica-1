import kotlin.system.measureNanoTime
import kotlin.system.measureTimeMillis

@ExperimentalStdlibApi
fun main (){

    val tiempo = measureTimeMillis{

        val lista: List<Int>


        lista = buildList {
            addAll(0..100000000) // O(1)
            shuffle() // O(n)
        }

        // O(n)
        lista.forEach {
            println(it)
        }
    }
    println("Tiempo que demoro:  $tiempo")
}