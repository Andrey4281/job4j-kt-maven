package observer

class Subject {
    private val list = mutableListOf<MyObservable>()

    fun subscribe(myObservable: MyObservable) = list.add(myObservable)

    fun unsubscribe(myObservable: MyObservable) = list.remove(myObservable)

    fun notifySubscribers(msg: String) = list.forEach { it.callMe(msg) }
}
