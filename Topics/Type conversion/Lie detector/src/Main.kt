import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println(lieDetector(scanner.nextLine()))
}

fun lieDetector(value: String): Boolean {
    return value.toBoolean()
}