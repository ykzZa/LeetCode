package medium

import org.testng.annotations.Test
import kotlin.test.assertContentEquals

class Problem0238Test {

    @Test
    fun testExampleOne() {
        val problem = Problem0238()
        val result = problem.productExceptSelf(intArrayOf(1, 2, 3, 4))
        assertContentEquals(intArrayOf(24, 12, 8, 6), result)
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem0238()
        val result = problem.productExceptSelf(intArrayOf(-1, 1, 0, -3, 3))
        assertContentEquals(intArrayOf(0, 0, 9, 0, 0), result)
    }
}