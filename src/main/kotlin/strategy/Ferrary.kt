package strategy

class Ferrary(private val flyable: Flyable): Car(flyable) {
    override fun run() = println("run ferrary")
}
