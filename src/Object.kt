/**Object Declaration
 * digunakan untuk mengembalikan satu nilai saja atau Singleton
 * */

fun main() {
    Student.goToSchool()
}

object Student {
    var name = "tegar"

    fun goToSchool() {
        println("$name is going to school")
    }
}