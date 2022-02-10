/**Interface
 * Kumpulan Metode Abstrak
 *
 * */

fun main() {
    val button = Button()
    button.onClick()
    button.onTouch()
}

class Button():ButtonInterface {
    override var buttonName: String = "Login"

    override fun onClick() {
        println("$buttonName clicked")
    }

    override fun onTouch() {
        println("$buttonName touched")
    }

}

interface ButtonInterface {

    var buttonName: String
    fun onClick()
    fun onTouch()
}
