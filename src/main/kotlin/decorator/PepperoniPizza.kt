package decorator

class PepperoniPizza(private val pizza: Pizza): Pizza {

    override fun makePizza(): String = "${pizza.makePizza()}pepperoni "
}
