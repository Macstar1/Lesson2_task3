import kotlin.math.roundToInt

fun main() {
    val orderAmount = 10_100
    val regularCustomer = false

    println(totalPrice(orderAmount, regularCustomer))

}

fun totalPrice(orderAmount: Int, regularCustomer: Boolean): Int {
    val baseAmount: Double = if (orderAmount >= LEVEL2) {
        (orderAmount * LEVEL2_AMOUNT)
    } else if (orderAmount >= LEVEL1) {
        (orderAmount - LEVEL1_AMOUNT).toDouble()
    } else orderAmount.toDouble()
    return if (regularCustomer) {
        (baseAmount * REGULAR_AMOUNT).roundToInt()
    } else baseAmount.roundToInt()
}

const val LEVEL1: Int = 1_001
const val LEVEL2: Int = 10_001
const val LEVEL1_AMOUNT: Int = 100
const val LEVEL2_AMOUNT = .95
const val REGULAR_AMOUNT = .9
