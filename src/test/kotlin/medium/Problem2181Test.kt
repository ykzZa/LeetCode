package medium

import helper.ListNode
import helper.listNodeToArray
import org.testng.annotations.Test
import kotlin.test.assertContentEquals

class Problem2181Test {
    @Test
    fun testExampleOne() {
        val problem = Problem2181()

        val list = ListNode(0).apply {
            next = ListNode(3).apply {
                next = ListNode(1).apply {
                    next = ListNode(0).apply {
                        next = ListNode(4).apply {
                            next = ListNode(5).apply {
                                next = ListNode(2).apply {
                                    next = ListNode(0)
                                }
                            }
                        }
                    }
                }
            }
        }

        val output = ListNode(4).apply {
            next = ListNode(11)
        }

        val result = problem.mergeNodes(list)
        assertContentEquals(listNodeToArray(output), listNodeToArray(result))
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem2181()

        val list = ListNode(0).apply {
            next = ListNode(1).apply {
                next = ListNode(0).apply {
                    next = ListNode(3).apply {
                        next = ListNode(0).apply {
                            next = ListNode(2).apply {
                                next = ListNode(2).apply {
                                    next = ListNode(0)
                                }
                            }
                        }
                    }
                }
            }
        }

        val output = ListNode(1).apply {
            next = ListNode(3).apply {
                next = ListNode(4)
            }
        }

        val result = problem.mergeNodes(list)
        assertContentEquals(listNodeToArray(output), listNodeToArray(result))
    }

    @Test
    fun testExampleThree() {
        val problem = Problem2181()

        val list = ListNode(0).apply {
            next = ListNode(24).apply {
                next = ListNode(14).apply {
                    next = ListNode(0)
                }
            }
        }

        val output = ListNode(38)

        val result = problem.mergeNodes(list)
        assertContentEquals(listNodeToArray(output), listNodeToArray(result))
    }
}