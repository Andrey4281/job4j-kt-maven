package strategy

fun main() {
    val car = Ferrary(FlyCar())
    car.fly()

    val tractor = Tractor(NoFly())
    tractor.fly()
}
