fun main() {
    val rangeMin1 = readln().toInt()
    val rangeMax1 = readln().toInt()
    val rangeMin2 = readln().toInt()
    val rangeMax2 = readln().toInt()
    val input = readln().toInt()
    print(input in rangeMin1..rangeMax1 && input in rangeMin2..rangeMax2)
}