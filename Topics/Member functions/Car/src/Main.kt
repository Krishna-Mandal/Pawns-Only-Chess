const val SPEED_CHANGE = 5

class Car(val make: String, val year: Int) {
    var speed: Int = 0

    fun accelerate() {
        speed += SPEED_CHANGE
    }

    fun decelerate() {
        if (speed < SPEED_CHANGE) {
            speed = 0
        } else {
            speed -= SPEED_CHANGE
        }
    }
}