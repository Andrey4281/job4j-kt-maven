package bridge

fun main() {
    val car = Car(Toyota())
    car.drive()
    val track = Track(Audi())
    track.drive()
}
