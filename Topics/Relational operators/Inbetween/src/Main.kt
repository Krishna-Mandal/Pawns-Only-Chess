fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()

    var min: Int = b
    var max: Int = c

    if (b > c) {
        min = c
        max = b
    }

    print(a in min..max)
}