import java.lang.Math.abs

const val DECIMAL = 10
fun getLastDigit(a: Int) = abs(a) % DECIMAL

/* Do not change code below */
fun main() {
    val a = readLine()!!.toInt()
    println(getLastDigit(a))
}
