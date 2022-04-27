const val MIN_AGE = 18
const val MAX_AGE = 59
fun main() {
    val legalAgeRange = MIN_AGE..MAX_AGE
    println(readln().toInt() in legalAgeRange)
}