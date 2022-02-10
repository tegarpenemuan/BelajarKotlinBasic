/**Data Class mudahnya seperti model pada Java
 * Data Class adalah tempat untuk menampung data yang digunakan oleh class lain
 *
 * */
fun main() {
    val personList = ArrayList<Person>()
    for (x in 0 until nameList().size) {
        val person = Person(nameList()[x],20+x)
        personList.add(person)
    }

    print(personList.toString())
}

//Data Class
data class Person(var name:String, var age:Int)

//implement ArrayList
fun nameList(): ArrayList<String> {
    val names = ArrayList<String>()
    names.add("Tegar")
    names.add("Penemuan")
    names.add("Anis")
    names.add("Marcela")

    return names
}

/**function nameList() berisi data ArrayList kemudian data tersebut dipanggil di fun main()
 * karena datanya Array maka kita tampilkan datanya dengan perulangan yang index awalnya adalah 0
 * sehingga data dapat dimunculkan.
 * */