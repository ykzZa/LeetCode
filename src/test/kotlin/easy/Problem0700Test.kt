package easy

import helper.TreeNode
import helper.treeToList
import org.testng.Assert.assertEquals
import org.testng.Assert.assertNull
import org.testng.annotations.Test

class Problem0700Test {

    private fun buildTree(): TreeNode {
        val root = TreeNode(4).apply {
            left = TreeNode(2).apply {
                left = TreeNode(1)
                right = TreeNode(3)
            }
            right = TreeNode(7)
        }
        return root
    }

    @Test
    fun testExampleOne() {
        val root = buildTree()
        val problem = Problem0700()
        val result = problem.searchBST(root, 2)
        assertEquals(listOf(2, 1, 3), treeToList(result))
    }

    @Test
    fun testExampleTwo() {
        val root = buildTree()
        val problem = Problem0700()
        val result = problem.searchBST(root, 5)
        assertNull(result)
    }
}