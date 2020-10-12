package adapter

class SimpleAmericanSocket: AmericanSocket {
    override fun getPower() = println("get 110 volt")
}
