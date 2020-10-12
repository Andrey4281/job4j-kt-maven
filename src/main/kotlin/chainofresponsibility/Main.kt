package chainofresponsibility

fun main() {
    val messageHandler = MessageVerifyHandler(MessageEditHandler(MessagePrintHandler(null)))
    messageHandler.handle("Hello world")
}
