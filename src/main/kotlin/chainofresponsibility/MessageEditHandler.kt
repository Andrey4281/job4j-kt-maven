package chainofresponsibility

class MessageEditHandler(private val messageHandler: MessageHandler?): MessageHandler(messageHandler) {

    override fun handle(message: String) {
        messageHandler?.handle("$message !")
    }
}
