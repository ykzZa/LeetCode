package helper

fun listNodeToArray(node: ListNode?): IntArray {
    val result = mutableListOf<Int>()
    var current = node
    while (current != null) {
        result.add(current.`val`)
        current = current.next
    }
    return result.toIntArray()
}