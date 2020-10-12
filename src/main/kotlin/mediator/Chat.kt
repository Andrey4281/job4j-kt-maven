package mediator

interface Chat {
    fun sendMessage(message: String, colleague: Colleague)
    fun addColleague(colleague: Colleague)
}
