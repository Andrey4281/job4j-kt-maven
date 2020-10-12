package template

/**
 * Паттерн template.
 * Объеденяет несколько классов с похожим поведением в один абстрактный класс.
 * @author asemenov
 * @since 12.10.2020
 */
abstract class Beverage {
    fun boilWater() = println("boiled water")
    fun addSugar() = println("add sugar")
    abstract fun addBeverage()
    abstract fun addCondiment()
    open fun hook() {}


    fun makeBeverage() {
        boilWater()
        addBeverage()
        addSugar()
        addCondiment()
        hook()
    }
}
