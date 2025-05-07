package easy

import org.testng.Assert.assertEquals
import org.testng.Assert.assertNull
import org.testng.annotations.Test

class Problem0700Test {

    private fun buildTree(): Problem0700.TreeNode {
        val root = Problem0700.TreeNode(4)
        root.left = Problem0700.TreeNode(2)
        root.right = Problem0700.TreeNode(7)
        root.left?.left = Problem0700.TreeNode(1)
        root.left?.right = Problem0700.TreeNode(3)
        return root
    }

    private fun treeToList(root: Problem0700.TreeNode?): List<Int> {
        val result = mutableListOf<Int>()
        fun inorder(node: Problem0700.TreeNode?) {
            if (node == null) return
            inorder(node.left)
            result.add(node.`val`)
            inorder(node.right)
        }
        inorder(root)
        return result
    }

    @Test
    fun testExampleOne() {
        val root = buildTree()
        val problem = Problem0700()
        val result = problem.searchBST(root, 2)
        assertEquals(listOf(1, 2, 3), treeToList(result))
    }

    @Test
    fun testExampleTwo() {
        val root = buildTree()
        val problem = Problem0700()
        val result = problem.searchBST(root, 5)
        assertNull(result)
    }
}