package decorator

/**
 * Для каждого ингредиента будем делать свой класс и он будет добавляться к общей пицце
 */
interface Pizza {
    fun makePizza(): String
}
