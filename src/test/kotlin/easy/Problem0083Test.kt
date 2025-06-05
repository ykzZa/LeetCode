package easy

import helper.ListNode
import helper.listNodeToArray
import org.testng.annotations.Test
import kotlin.test.assertContentEquals

class Problem0083Test {

    @Test
    fun testExampleOne() {
        val problem = Problem0083()

        val list = ListNode(1).apply {
            next = ListNode(1).apply {
                next = ListNode(2)
            }
        }

        val output = ListNode(1).apply {
            next = ListNode(2)
        }

        val result = problem.deleteDuplicates(list)
        assertContentEquals(listNodeToArray(output), listNodeToArray(result))
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem0083()

        val list = ListNode(1).apply {
            next = ListNode(1).apply {
                next = ListNode(2).apply {
                    next = ListNode(3).apply {
                        next = ListNode(3)
                    }
                }
            }
        }

        val output = ListNode(1).apply {
            next = ListNode(2).apply {
                next = ListNode(3)
            }
        }

        val result = problem.deleteDuplicates(list)
        assertContentEquals(listNodeToArray(output), listNodeToArray(result))
    }
}