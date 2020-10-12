package strategy

class NoFly: Flyable {
    override fun fly() = println("no fly")
}
