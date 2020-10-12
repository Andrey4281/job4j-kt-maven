package mediator

class ChatMediator: Chat {
    private val colleagues = mutableListOf<Colleague>()

    override fun sendMessage(message: String, me: Colleague) =
        colleagues.stream().filter { it != me }.forEach { it.printMessage(message) }

    override fun addColleague(colleague: Colleague) {
        colleagues.add(colleague)
    }
}
