package momento

class Originator(var state: String) {

    fun saveState() = Momento(this.state)

    fun restoreFromMomento(momento: Momento)  {
        this.state = momento.state
    }

    class Momento(var state: String)
}
