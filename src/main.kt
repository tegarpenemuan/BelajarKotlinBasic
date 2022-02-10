/*fun main() adalah function yang dijalankan pertama kali atau disebut dengan entri point*/
fun main() {
    println("Hello World")
    getHello()
    message()
}

/*membuat function di kotlin yaitu dengan 'fun nama_function () { ... }'*/
fun getHello() {
    println("Hello Saya Dari Function getHello")
}

/*Belajar Variabel kotlin
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

/*Output
* main() => Hello World
*
* getHello() => Hello Saya Dari Function getHello
*
* message() => val -> Hai
*              var -> Penemuan
* */