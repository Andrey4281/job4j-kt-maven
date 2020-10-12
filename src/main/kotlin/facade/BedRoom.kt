package facade

class BedRoom {
    private val roomFacade = RoomFacade()

    fun pressButton(channel: String, temperature: String)
            = roomFacade.pressButton(channel, temperature)
}
