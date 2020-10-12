package chainofresponsibility

abstract class MessageHandler(private val messageHandler: MessageHandler? = null) {

    abstract fun handle(message: String)
}
