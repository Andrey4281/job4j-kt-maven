package bridge

class Track(model: Model): Vehicle(model) {

    override fun drive() = model.drive("drive track")
}
