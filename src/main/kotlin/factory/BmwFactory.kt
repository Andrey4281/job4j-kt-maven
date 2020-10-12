package factory

class BmwFactory: CarFactory() {
    override fun getCar(): Car = Bmw()
}
