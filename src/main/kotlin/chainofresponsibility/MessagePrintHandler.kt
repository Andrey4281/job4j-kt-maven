package chainofresponsibility

class MessagePrintHandler(messageHandler: MessageHandler?): MessageHandler(messageHandler) {
    override fun handle(message: String) {
        println(message)
    }
}
