package bridge

class Car(model: Model) : Vehicle(model) {
    override fun drive() = model.drive("drive car")
}
