package proxy

open class MyReader: Reader {
    override fun read(str: String): String = "$str world"
}
