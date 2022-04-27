fun main() {
    var sum = 0
    readLine()!!.forEach { sum += it.toString().toInt() }

    println(sum)
}