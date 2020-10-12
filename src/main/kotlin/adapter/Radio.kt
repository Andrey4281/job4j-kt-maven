package adapter

class Radio {
    fun listenMusic(euroSocket: EuroSocket) = euroSocket.getPower()
}

fun main() {
    val socket = SimpleAmericanSocket()
    val radio = Radio()
    //How can I transform AmericanSocket to EuroSocket
    val socketAdapter = SocketAdapter(socket)
    radio.listenMusic(socketAdapter)
}

