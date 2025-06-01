package medium

import helper.ListNode
import helper.listNodeToArray
import org.testng.annotations.Test
import kotlin.test.assertContentEquals

class Problem2807Test {

    @Test
    fun testExampleOne() {
        val problem = Problem2807()

        val list = ListNode(18).apply {
            next = ListNode(6).apply {
                next = ListNode(10).apply {
                    next = ListNode(3)
                }
            }
        }

        val output = ListNode(18).apply {
            next = ListNode(6).apply {
                next = ListNode(6).apply {
                    next = ListNode(2).apply {
                        next = ListNode(10).apply {
                            next = ListNode(1).apply {
                                next = ListNode(3)
                            }
                        }
                    }
                }
            }
        }

        val result = problem.insertGreatestCommonDivisors(list)
        assertContentEquals(listNodeToArray(output), listNodeToArray(result))
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem2807()

        val list = ListNode(7)

        val output = ListNode(7)

        val result = problem.insertGreatestCommonDivisors(list)
        assertContentEquals(listNodeToArray(output), listNodeToArray(result))
    }
}