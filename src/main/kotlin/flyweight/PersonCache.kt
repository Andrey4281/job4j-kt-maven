package flyweight

import java.lang.IllegalArgumentException
import java.util.*

/**
 * Кэш для кэширования тяжеловесных объектов
 */
class PersonCache {
    private val studentUniversityInfos: WeakHashMap<String, StudentUniversityInfo> = WeakHashMap()

    fun getStudentUniversityInfo(faculty: String): StudentUniversityInfo {
        var studentUniversityInfo = studentUniversityInfos[faculty]
        if (studentUniversityInfo == null) {
            studentUniversityInfo = createStudentInfo(faculty)
            studentUniversityInfos[faculty] = studentUniversityInfo
        }
        return studentUniversityInfo
    }

    private fun createStudentInfo(faculty: String): StudentUniversityInfo {
        return when (faculty) {
            "informatics" -> StudentUniversityInfo("informatics", "New York", Hostel())
            "management" -> StudentUniversityInfo("management", "Los Angeles", Hostel())
            else -> {
                throw IllegalArgumentException("no faculty")
            }
        }
    }
}
