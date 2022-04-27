const val TIMES_4 = 4
fun main() {
    repeat(TIMES_4) {
        println(readln().first().isDigit())
    }
}