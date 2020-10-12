package state

class HasQuarter: State() {
    override fun insertQuarter(gumMachine: GumMachine) = println("You have set quarter already")

    override fun turnCrank(gumMachine: GumMachine) {
        if (count < 0) {
            gumMachine.state = SoldOut()
        } else {
            println("selling ...")
            count--
            gumMachine.state = NoQuarter()
        }
    }
}
