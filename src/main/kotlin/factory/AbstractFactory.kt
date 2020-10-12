package factory

abstract class AbstractFactory {
    abstract fun getCar(): Car
    abstract fun getBike(): Bike
}
