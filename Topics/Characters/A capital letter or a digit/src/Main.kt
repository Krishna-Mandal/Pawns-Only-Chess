const val ZERO = '0'
fun main() {
    val input = readln().first()
    println(input != ZERO && (input.isDigit() || input.isUpperCase()))
}