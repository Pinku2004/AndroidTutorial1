fun sumOfList(numbers: List<Int>): Int {
    var sum = 0
    for (number in numbers) {
        sum += number
    }
    return sum
}

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val sum = sumOfList(numbers)
    println("The sum of the list is $sum")
}
