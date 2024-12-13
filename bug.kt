fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.removeIf { it % 2 == 0 }
    println(list)
}
This code snippet demonstrates a common issue where `removeIf` modifies the list while iterating over it. This causes unexpected behavior because the indices change. 

Another less common but equally problematic scenario is using raw types with collections. This leads to unchecked warnings and potential runtime exceptions:

fun main() {
    val list = ArrayList<Any>()
    list.add(1)
    list.add("hello")
    // The following loop does not correctly handle the mixed types.  
    for (item in list) {
        println(item is Int) // May not behave as expected
    }
}
This code doesn't cause immediate errors, but it allows adding elements of different types to the list and produces unexpected results.  Trying to treat all elements as a specific type (e.g., using 'item as Int') will result in a ClassCastException if an element is not an integer. 