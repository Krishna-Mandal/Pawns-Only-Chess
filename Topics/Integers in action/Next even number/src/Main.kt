fun main() {
    val unknown = readLine()!!.toInt()

    if (unknown % 2 == 0) {
        println(unknown + 2)
    } else {
        println(unknown + 1)
    }
}