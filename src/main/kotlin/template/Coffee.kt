package template

class Coffee: Beverage() {

    override fun addBeverage() {
        println("add coffee")
    }

    override fun addCondiment() {
        println("add milk")
    }
}
