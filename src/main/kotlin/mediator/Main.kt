package mediator

fun main() {
    val chat = ChatMediator()
    val colleague = ColleagueImpl(chat, "Kris")
    chat.addColleague(colleague)
    chat.addColleague(ColleagueImpl(chat, "Bob"))
    chat.addColleague(ColleagueImpl(chat, "Mike"))
    colleague.sendMessage("Hello")
}
