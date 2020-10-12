package facade

/**
 * Объеденяет в себе сложную логику в вызове одного метода
 */
class RoomFacade {
    private val tv = Tv()
    private val airConditioning = AirConditioning()
    private val light = Light()

    fun pressButton(channel: String, temperature: String) {
        tv.playChannel(channel)
        airConditioning.setTemperature(temperature)
        light.turnLight()
    }
}
