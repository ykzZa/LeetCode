package easy

import helper.TreeNode
import org.testng.Assert.assertEquals
import org.testng.Assert.assertNull
import org.testng.annotations.Test

class Problem0700Test {

    private fun buildTree(): TreeNode {
        val root = TreeNode(4)
        root.left = TreeNode(2)
        root.right = TreeNode(7)
        root.left?.left = TreeNode(1)
        root.left?.right = TreeNode(3)
        return root
    }

    private fun treeToList(root: TreeNode?): List<Int> {
        val result = mutableListOf<Int>()
        fun inorder(node: TreeNode?) {
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