package observer

fun main() {
    val subject = Subject()
    subject.subscribe(SubscriberOne())
    subject.subscribe(SubscriberTwo())
    subject.notifySubscribers("Hello world!")
}
