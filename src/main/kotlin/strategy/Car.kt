package strategy

abstract class Car(private val flyable: Flyable) {
    abstract fun run()
    fun stop() = println("Stop")
    fun fly() = flyable.fly()
}
