package decorator

fun main() {
    val cheesePizza = CheesePizza(DoughPizza())
    val cheesePepperoniPizzaPizza = PepperoniPizza(cheesePizza)
    println(cheesePepperoniPizzaPizza.makePizza())
}
