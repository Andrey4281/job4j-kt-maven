package state

class SoldOut: State() {

    override fun insertQuarter(gumMachine: GumMachine) {
        println("no gyms")
    }

    override fun turnCrank(gumMachine: GumMachine) {
        println("no gyms")
    }
}
