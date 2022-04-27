const val TEN = 10
const val HUNDRED = 100
fun main() {
    val number = readLine()!!.toInt()
    println(number % HUNDRED / TEN)
}
