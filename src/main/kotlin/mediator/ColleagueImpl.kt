package mediator

class ColleagueImpl(private val chat: Chat, private val name: String): Colleague(chat, name) {
    override fun sendMessage(message: String) = this.chat.sendMessage(message, this)

    override fun printMessage(message: String) = println("${this.name} $message")
}
