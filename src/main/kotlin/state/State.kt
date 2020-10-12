package state

abstract class State {
    var count = 10;

    abstract fun insertQuarter(gumMachine: GumMachine)
    abstract fun turnCrank(gumMachine: GumMachine)
}
