import java.lang.Math.ceil

fun main() {
    val firstGroup = readLine()!!.toDouble()
    val secondGroup = readLine()!!.toDouble()
    val thirdGroup = readLine()!!.toDouble()

    println((ceil(firstGroup / 2) + ceil(secondGroup / 2) + ceil(thirdGroup / 2)).toInt())
}