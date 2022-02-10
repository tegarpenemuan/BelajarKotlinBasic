fun main() {
    val cart = cartInit()
}

class cartInit() {
    var product = "Laptop"

    fun addToCart() {
        println("$product Berhasil Ditambahkan")
    }

    //init digunakan untuk mengeksekusi properti atau method secara otomatif ketika class di instance
    init {
        addToCart()
    }
}