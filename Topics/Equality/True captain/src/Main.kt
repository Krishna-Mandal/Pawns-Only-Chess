data class Pirate(var name: String)

fun main() {
    val captain = Pirate("Hector Barbossa")
    println(captain.name)
    // Do not touch the lines above
    val newCaptain = Pirate("Jack Sparrow")
    println(newCaptain.name)

}