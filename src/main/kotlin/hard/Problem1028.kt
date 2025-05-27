package hard

import helper.TreeNode

class Problem1028 {

    fun recoverFromPreorder(traversal: String): TreeNode? {
        val lastNodes = Array<TreeNode?>(1001) { null }
        var cursorIndex = 0

        while (cursorIndex < traversal.length) {
            var depth = 0
            var i = cursorIndex
            while (traversal[i] == '-') {
                depth++
                i++
            }

            var num = 0
            while (i < traversal.length && traversal[i] != '-') {
                num = num * 10 + traversal[i].code - 48
                i++
            }

            val node = TreeNode(num)


            val parentNode = if (depth != 0) {
                lastNodes[depth - 1]
            } else {
                null
            }

            if (parentNode?.left == null) {
                parentNode?.left = node
            } else {
                parentNode.right = node
            }

            lastNodes[depth] = node
            cursorIndex = i
        }
        return lastNodes[0]
    }
}