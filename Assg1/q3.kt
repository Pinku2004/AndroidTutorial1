
fun gcd(a: Int, b: Int): Int {
    return if (b == 0) a else gcd(b, a % b)
}

fun main() {
    val num1 = 54
    val num2 = 100
    println("GCD of $num1 and $num2 is ${gcd(num1, num2)}")
}