package strategy

class Tractor(private val flyable: Flyable): Car(flyable) {
    override fun run() = println("run tractor")
}
