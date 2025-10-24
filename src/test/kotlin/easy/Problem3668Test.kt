package easy

import org.testng.annotations.Test
import kotlin.test.assertContentEquals

class Problem3668Test {

    @Test
    fun testExampleOne() {
        val problem = Problem3668()
        val result = problem.recoverOrder(intArrayOf(3, 1, 2, 5, 4), intArrayOf(1, 3, 4))
        assertContentEquals(intArrayOf(3, 1, 4), result)
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem3668()
        val result = problem.recoverOrder(intArrayOf(1, 4, 5, 3, 2), intArrayOf(2, 5))
        assertContentEquals(intArrayOf(5, 2), result)
    }
}