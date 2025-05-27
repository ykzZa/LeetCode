package helper

fun areTreesEqual(a: TreeNode?, b: TreeNode?): Boolean {
    if (a == null || b == null) return a == b
    return a.`val` == b.`val` &&
            areTreesEqual(a.left, b.left) &&
            areTreesEqual(a.right, b.right)
}

fun treeToList(root: TreeNode?): List<Int?> {
    if (root == null) return emptyList()
    val result = mutableListOf<Int?>()
    val queue: ArrayDeque<TreeNode?> = ArrayDeque()
    queue.add(root)

    while (queue.isNotEmpty()) {
        val node = queue.removeFirst()
        if (node != null) {
            result.add(node.`val`)
            queue.add(node.left)
            queue.add(node.right)
        } else {
            result.add(null)
        }
    }

    while (result.isNotEmpty() && result.last() == null) {
        result.removeAt(result.size - 1)
    }

    return result
}