package facade

fun main() {
    val livingRoom = LivingRoom()
    livingRoom.pressButton("3", "21")

    val bedRoom = BedRoom()
    bedRoom.pressButton("5", "25")
}
