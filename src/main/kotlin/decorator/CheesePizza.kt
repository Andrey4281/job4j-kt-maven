package decorator

class CheesePizza(private val pizza: Pizza): Pizza {

    override fun makePizza(): String = "${pizza.makePizza()}cheese "
}
