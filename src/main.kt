/**fun main() adalah function yang dijalankan pertama kali atau disebut dengan entri point*/
fun main() {
    println("Hello World") //main() => Hello World
    getHello()
    message()
    data()
    controlFlowIf()
    controlFlowWhen()
    controlFlowFor()
    dataCollection()
    dataCollection2()
}

/**membuat function di kotlin yaitu dengan 'fun nama_function () { ... }'*/
fun getHello() {
    println("Hello Saya Dari Function getHello")
}
//getHello() => Hello Saya Dari Function getHello


/**Belajar Variabel kotlin
* Val => variabel yang tidak bisa diubah nilainya
* Var => Variabel yang bisa diubah nilainya
* */
fun message() {
    val message = "Hai"
    println(message)

    var name = "Tegar"
    name = "Penemuan"
    println(name)
}
//message() => val -> Hai
//             var -> Penemuan*


/**Belajar Data Types atau Type Data
 *
 * Penulisan: 'var namaVariabel: TypeData = value
 *
 * Contoh:
 *      String  => var name: String = "Tegar Penemuan"
 *      Integer => var age: Int = 20
 *
 * Jika dipanggil:
 * print("Nama Saya $name dan Umur Saya $umur")
 */
fun data() {
    val name = "Tegar Penemuan"
    val age = 20

    println("Nama Saya $name dan Umur Saya $age Tahun")
}
//data() => Nama Saya Tegar Penemuan dan Umur Saya 20 Tahun



/**Control Flow
 *
 *if else if
 *
 * when
 *
 * for
 *
 * while
 * */
fun controlFlowIf() {
    val minAge: Int = 13
    val tegarAge: Int = 20

    if (tegarAge > minAge) {
        println("Memenuhi Syarat")
    } else if(tegarAge == minAge) {
        println("Umur Pas Tunggu 1 Tahun Lagi")
    } else {
        println("Maaf Tidak Memenuhi Syarat")
    }
}

fun controlFlowWhen() {
    val tegarLevel: String = "hard"

    when(tegarLevel) {
        "beginner" -> println("Tegar has a basic skill")
        "medium" -> println("Tegar has a intermediate skill")
        "hard" -> println("Tegar has an expert")
        else -> println("Tegar has no skill")
    }
}

fun controlFlowFor() {
    println("For Dengan Until")
    for(x in 1 until 10) print(x) //Output 123456789
    println("")
    println("For Dengan ..")
    for (y in 1..10) print(y) //Output 12345678910
    println("")
    println("For Dengan until dan Step 2")
    for (z in 1 until 10 step 2) print(z) //Output 13579
    println("")
}

/**Collection => mudahnya seperti Array atau List
 * fungsi collection ini adalah untuk membungkus data
 * */
fun dataCollection() {
    val names = arrayOf("Tegar", "Penemuan", "Anis","Marcela")
    for (name in names) println(name)
}

fun dataCollection2() {
    val nameList = ArrayList<String>()
    nameList.add("1.Tegar")
    nameList.add("2.Penemuan")
    nameList.add("3.Anis")
    nameList.add("4.Marcela")

    for (name in nameList) println(name)
}


