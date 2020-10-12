package state

class Winner: State() {
    override fun insertQuarter(gumMachine: GumMachine) {
        println("You are winner")
    }

    override fun turnCrank(gumMachine: GumMachine) {
        if (count <= 0) {
            gumMachine.state = SoldOut()
        } else {
            println("get gym")
            count--
            gumMachine.state = NoQuarter()
        }
    }
}
