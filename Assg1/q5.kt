fun isDuckNumber(number: Int): Boolean {
    if (number <= 0) {
        return false
    }
    
    var hasZero = false
    var temp = number

    if (temp.toString()[0] == '0') {
        return false
    }

    while (temp > 0) {
        val currentDigit = temp % 10
        if (currentDigit == 0) {
            hasZero = true
        }
        temp /= 10
    }
    
    return hasZero
}

fun main() {
    val number = 700
    val isDuck = isDuckNumber(number)
    if (isDuck) {
        println("$number is a duck number.")
    } else {
        println("$number is not a duck number.")
    }
}
