const val TIME_MUL = 60
fun main() {
    val hrs1 = readLine()!!.toInt()
    val min1 = readLine()!!.toInt()
    val sec1 = readLine()!!.toInt()
    val time1InSec = hrs1 * TIME_MUL * TIME_MUL + min1 * TIME_MUL + sec1

    val hrs2 = readLine()!!.toInt()
    val min2 = readLine()!!.toInt()
    val sec2 = readLine()!!.toInt()
    val time2InSec = hrs2 * TIME_MUL * TIME_MUL + min2 * TIME_MUL + sec2

    print(time2InSec - time1InSec)
}