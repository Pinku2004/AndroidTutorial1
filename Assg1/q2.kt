fun isArmstrong(number: Int): Boolean {
    val digits = number.toString().map { it.toString().toInt() }
    val numberOfDigits = digits.size
    val sum = digits.sumOf { Math.pow(it.toDouble(), numberOfDigits.toDouble()).toInt() }
    return number == sum
}

fun main() {
    val number = 407 
    if (isArmstrong(number)) {
        println("$number Armstrong number.")
    } else {
        println("$number not Armstrong number.")
    }
