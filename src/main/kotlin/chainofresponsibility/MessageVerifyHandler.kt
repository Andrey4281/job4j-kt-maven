package chainofresponsibility

class MessageVerifyHandler(private val messageHandler: MessageHandler?): MessageHandler(messageHandler) {

    override fun handle(message: String) {
        if (!(message matches(Regex(".*\\d.*")))) {
            messageHandler?.handle(message)
        }
    }
}
