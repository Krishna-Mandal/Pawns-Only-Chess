const val NUM_JOURNEY = 2
fun main() {
    val numDays = readLine()!!.toInt()
    val numNights = numDays - 1
    val food = readLine()!!.toInt()
    val flight = readLine()!!.toInt()
    val acco = readLine()!!.toInt()

    println(flight * 2 + food * numDays + acco * numNights)
}