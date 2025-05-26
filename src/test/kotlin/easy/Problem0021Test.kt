package easy

import helper.ListNode
import org.testng.annotations.Test
import kotlin.test.assertContentEquals

class Problem0021Test {

    @Test
    fun testExampleOne() {
        val problem = Problem0021()

        val list1 = ListNode(1).apply {
            next = ListNode(2).apply {
                next = ListNode(4)
            }
        }

        val list2 = ListNode(1).apply {
            next = ListNode(3).apply {
                next = ListNode(4)
            }
        }

        val output = ListNode(1).apply {
            next = ListNode(1).apply {
                next = ListNode(2).apply {
                    next = ListNode(3).apply {
                        next = ListNode(4).apply {
                            next = ListNode(4)
                        }
                    }
                }
            }
        }

        val result = problem.mergeTwoLists(list1, list2)
        assertContentEquals(listNodeToArray(output), listNodeToArray(result))
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem0021()

        val list1 = null

        val list2 = null

        val output = null

        val result = problem.mergeTwoLists(list1, list2)
        assertContentEquals(listNodeToArray(output), listNodeToArray(result))
    }

    @Test
    fun testExampleThree() {
        val problem = Problem0021()

        val list1 = null

        val list2 = ListNode(0)

        val output = ListNode(0)

        val result = problem.mergeTwoLists(list1, list2)
        assertContentEquals(listNodeToArray(output), listNodeToArray(result))
    }

    private fun listNodeToArray(node: ListNode?): IntArray {
        val result = mutableListOf<Int>()
        var current = node
        while (current != null) {
            result.add(current.`val`)
            current = current.next
        }
        return result.toIntArray()
    }
}
