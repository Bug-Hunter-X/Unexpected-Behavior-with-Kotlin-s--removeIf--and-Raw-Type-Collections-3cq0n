fun main() {
    // Solution for removeIf issue: Iterate over a copy or use an iterator
    val list = mutableListOf(1, 2, 3, 4, 5)
    val evenNumbers = list.filter { it % 2 == 0 }
    val oddNumbers = list.filter { it % 2 != 0 }
    println(oddNumbers)
    //Alternative using an iterator
    val list2 = mutableListOf(1, 2, 3, 4, 5)
    val iterator = list2.iterator()
    while (iterator.hasNext()) {
        if (iterator.next() % 2 == 0) {
            iterator.remove()
        }
    }
    println(list2)
}

fun main2() {
    // Solution for Raw Type Collections issue: Use generics
    val intList = mutableListOf<Int>()
    intList.add(1)
    val stringList = mutableListOf<String>()
    stringList.add("hello")
    for (item in intList) {
        println(item) //Type safe
    }
    for (item in stringList) {
        println(item) //Type safe
    }
}
These solutions demonstrate safe and efficient ways to handle list modifications during iteration and to ensure type safety in collection usage.