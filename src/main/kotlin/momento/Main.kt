package momento

fun main() {
    val momentos = mutableListOf<Originator.Momento>()
    val originator = Originator("one")
    originator.state = "two"
    momentos.add(originator.saveState())
    originator.state = "three"
    println(originator.state)
    originator.restoreFromMomento(momentos[0])
    println(originator.state)
}
