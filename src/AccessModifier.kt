/**Access Modifier (Public, Private, Protected dan Internal)
 * Access modifier defaultnya adalah public
 * */

fun main() {
    val customer = customer()
    customer.getCusName()
    //customer.getCustStatus() //tidak bisa dijalankan di fun main karena getCusStatus accessnya private
}

class customer() {
    var name: String = "Tegar"
    var isActive:Boolean =  false

    fun getCusName() {
        println("Customer name is $name")
    }

    private fun getCustStatus() {
        if(isActive) {
            println("$name is a member")
        } else {
            println("$name is not a member")
        }
    }
}