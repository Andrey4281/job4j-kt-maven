package factory

class BmwsFactory: AbstractFactory() {
    override fun getCar(): Car = Bmw()

    override fun getBike(): Bike = BmwBike()
}
