package mediator

abstract class Colleague(private val chat: Chat, private val name: String) {
    abstract fun sendMessage(message: String)
    abstract fun printMessage(message: String)
}
