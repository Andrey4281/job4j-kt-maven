package observer

class SubscriberOne: MyObservable {
    override fun callMe(msg: String) = println("s1 $msg")
}
