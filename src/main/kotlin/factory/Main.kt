package factory

fun main() {
    val carFactory = BmwFactory()
    carFactory.createCar()

    val abstractFactory = BmwsFactory()
    val bike = abstractFactory.getBike()

    bike.drive()
}
