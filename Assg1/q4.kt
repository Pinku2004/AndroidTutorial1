fun letterFrequency(input: String): Map<Char, Int> {
    return input.filter { it.isLetter() }
                .groupingBy { it.lowercaseChar() }
                .eachCount()
}

fun main() {
    val input = "Hello World"
    val frequencies = letterFrequency(input)
    println("Letter frequencies in \"$input\":")
    for ((char, count) in frequencies) {
        println("$char: $count")
    }
}
