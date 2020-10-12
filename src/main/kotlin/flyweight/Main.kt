package flyweight

fun main() {
    val cache = PersonCache()
    val one = cache.getStudentUniversityInfo("management")
    val two = cache.getStudentUniversityInfo("management")
    println(one == two)
}
