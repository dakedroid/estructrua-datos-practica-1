import kotlin.system.measureTimeMillis

@OptIn(ExperimentalStdlibApi::class)
fun main (){
        val numbers: List<Int>
        val timeInMillis = measureTimeMillis {
            numbers = buildList {
                addAll(0..100)
                shuffle()
                sortDescending()
            }

            numbers.forEach {
                println(it)
            }
        }
// here numbers are initialized and sorted


      //  println(numbers.first()) // 100

        println("(The operation took $timeInMillis ms)")
    }
