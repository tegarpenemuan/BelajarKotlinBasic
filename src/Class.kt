fun main() {
    val cart = cart("Laptop")
    cart.addToCart()
}

class cart(var inputProduct:String) {

    fun addToCart() {
        println("$inputProduct Berhasil Ditambahkan")
    }
}