package factory

/**
 * Используется чтобы избежать дублей кода
 */
abstract class CarFactory {
    fun createCar() {
        val car = getCar()
        car.drive()
        //... more code
    }

    abstract fun getCar(): Car
}
