package strategy

class Toyota(private val flyable: Flyable): Car(flyable) {
    override fun run() = println("run toyota")
}
