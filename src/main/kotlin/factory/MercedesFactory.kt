package factory

class MercedesFactory: CarFactory() {
    override fun getCar(): Car = Mercedes()
}
