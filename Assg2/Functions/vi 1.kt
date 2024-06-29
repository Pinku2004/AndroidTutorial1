fun maxOfTwo(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun main() {
    val num1 = 10
    val num2 = 20
    val largerNumber = maxOfTwo(num1, num2)
    println("The larger number between $num1 and $num2 is $largerNumber")
}
