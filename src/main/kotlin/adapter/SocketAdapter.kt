package adapter

class SocketAdapter(val socket: AmericanSocket): EuroSocket {

    override fun getPower() = socket.getPower()
}
