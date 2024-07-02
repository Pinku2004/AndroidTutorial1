fun main() {
    val people = listOf(
        "Priyanka" to 20,
        "Devanshi" to 21,
        "Preeti" to 22,
        "Pratisha" to 24,
        "Shruti" to 25
    )
    
    //val sortByAge = { list: List<Pair<String, Int>> -> list.sortedBy { it.second } }
    
    val sortedPeople = { list: List<Pair<String, Int>> -> list.sortedBy { it.second } }(people)
    println(sortedPeople)
}