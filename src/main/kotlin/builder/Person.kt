package builder

data class Person(val id: Int, val name: String? = null,
                  val surname: String? = null, var salary: Int? = null) {

    companion object Builder {
        private var id = 0
        private var name: String? = null
        private var surname: String? = null
        private var salary: Int? = null

        fun id(idVal: Int) = apply { id = idVal }
        fun name(nameVal: String?) = apply { name = nameVal }
        fun surnname(surnameVal: String?) = apply { surname = surnameVal}
        fun salary(salaryVal: Int?) = apply { salary = salaryVal }
        fun build(): Person {
            val idVal = id
            val nameVal = name
            val surnameVal = surname
            val salaryVal = salary

            id = 0
            name = null
            surname = null
            salary = null

            return Person(idVal, nameVal, surnameVal, salaryVal)
        }
    }
}

fun main() {
    val person = Person(id = 1)
    val personOther = Person
            .id(1)
            .name("Vasa")
            .surnname("Semenov")
            .salary(100)
            .build()

    val personTwo = Person
            .id(2)
            .build()

    println(person)
    println(personOther)
    println(personTwo)
}
