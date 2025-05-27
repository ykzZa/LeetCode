package hard

import helper.TreeNode
import helper.areTreesEqual
import helper.treeToList
import org.testng.annotations.Test
import kotlin.test.assertTrue

class Problem1028Test {

    @Test
    fun testExampleOne() {
        val problem = Problem1028()
        val result = problem.recoverFromPreorder("1-2--3--4-5--6--7")
        val expected = TreeNode(1).apply {
            left = TreeNode(2).apply {
                left = TreeNode(3)
                right = TreeNode(4)
            }
            right = TreeNode(5).apply {
                left = TreeNode(6)
                right = TreeNode(7)
            }
        }
        println(treeToList(result))
        assertTrue(areTreesEqual(expected, result))
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem1028()
        val result = problem.recoverFromPreorder("1-2--3---4-5--6---7")
        val expected = TreeNode(1).apply {
            left = TreeNode(2).apply {
                left = TreeNode(3).apply {
                    left = TreeNode(4)
                }
            }
            right = TreeNode(5).apply {
                left = TreeNode(6).apply {
                    left = TreeNode(7)
                }
            }
        }
        println(treeToList(result))
        assertTrue(areTreesEqual(expected, result))    }

    @Test
    fun testExampleThree() {
        val problem = Problem1028()
        val result = problem.recoverFromPreorder("1-401--349---90--88")
        val expected = TreeNode(1).apply {
            left = TreeNode(401).apply {
                left = TreeNode(349).apply {
                    left = TreeNode(90)
                }
                right = TreeNode(88)
            }
        }
        println(treeToList(result))
        assertTrue(areTreesEqual(expected, result))
    }
}