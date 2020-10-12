package observer

class SubscriberTwo: MyObservable {
    override fun callMe(msg: String) = println("s2 $msg")
}
