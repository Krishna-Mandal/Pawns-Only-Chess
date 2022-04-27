const val TRIANGLE_SIZE = 6
fun main() {
    for (index in 1..TRIANGLE_SIZE) {
        for (tempIndex in 1..index) {
            print("#")
        }
        println()
    }
}