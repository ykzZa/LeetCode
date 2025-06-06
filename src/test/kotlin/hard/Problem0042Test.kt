package hard

import org.testng.annotations.Test
import kotlin.test.assertEquals

class Problem0042Test {

    @Test
    fun testExampleOne() {
        val problem = Problem0042()
        val result = problem.trap(intArrayOf(0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1))
        assertEquals(6, result)
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem0042()
        val result = problem.trap(intArrayOf(4, 2, 0, 3, 2, 5))
        assertEquals(9, result)
    }
}