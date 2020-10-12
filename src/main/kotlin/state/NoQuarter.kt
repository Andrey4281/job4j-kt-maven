package state

import java.util.*

class NoQuarter: State() {
    override fun insertQuarter(gumMachine: GumMachine) {
        if (Random().nextBoolean()) {
            println("You are winner")
            gumMachine.state = Winner()
        } else {
            gumMachine.state = HasQuarter()
        }
    }

    override fun turnCrank(gumMachine: GumMachine) = println("no quarter")
}
