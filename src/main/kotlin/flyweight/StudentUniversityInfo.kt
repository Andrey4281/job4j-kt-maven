package flyweight

/**
 * В данному классе хранятся поля уникальные на уровне факультета.
 * не создаем каждый раз объекты а кэшируем тяжеловестные объекты для экономии оперативной памяти.
 */
data class StudentUniversityInfo(val faculty: String, val universityCity: String, val hostelAddress: Hostel)
