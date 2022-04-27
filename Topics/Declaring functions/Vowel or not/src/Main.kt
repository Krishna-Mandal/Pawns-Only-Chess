const val VOWEL = "aeiou"
fun isVowel(letter: Char) = VOWEL.contains(letter.toLowerCase())

fun main() {
    val letter = readLine()!!.first()

    println(isVowel(letter))
}