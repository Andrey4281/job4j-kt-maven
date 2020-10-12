package template

class Tea: Beverage() {
    override fun addBeverage() {
        println("add tea")
    }

    override fun addCondiment() {
        println("add lemon")
    }

    override fun hook() {
        println("add syrup")
    }
}
