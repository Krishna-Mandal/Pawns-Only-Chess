fun main() {
    val in1 = readLine()!!.toInt()
    val in2 = readLine()!!.toInt()
    val in3 = readLine()!!.toInt()

    println(in1 != in2 && in2 != in3 && in1 != in3)
}