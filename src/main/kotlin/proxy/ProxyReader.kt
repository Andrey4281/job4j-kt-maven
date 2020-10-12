package proxy

class ProxyReader: MyReader() {
    override fun read(str: String): String {
        println(str)
        val read = super.read(str)
        println(read)
        return read
    }
}
