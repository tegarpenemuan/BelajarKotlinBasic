/**fun main() adalah function yang dijalankan pertama kali atau disebut dengan entri point*/
fun main() {
    println("Hello World")
    getHello()
    message()
    data()
}

/**membuat function di kotlin yaitu dengan 'fun nama_function () { ... }'*/
fun getHello() {
    println("Hello Saya Dari Function getHello")
}

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






/**Output
* main() => Hello World
*
* getHello() => Hello Saya Dari Function getHello
*
* message() => val -> Hai
*              var -> Penemuan*
 *              
 * data() => Nama Saya Tegar Penemuan dan Umur Saya 20 Tahun    
 *          
* */