package state

class GumMachine {
    var state: State = NoQuarter()

    fun insertQuarter() {
        state.insertQuarter(this)
    }
    fun turnCrank() {
        state.turnCrank(this)
    }
}
