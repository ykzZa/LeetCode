package easy

import org.testng.annotations.Test
import kotlin.test.assertEquals

class Problem0704Test {

    @Test
    fun testExampleOne() {
        val problem = Problem0704()
        val result = problem.search(intArrayOf(-1, 0, 3, 5, 9, 12), 9)
        assertEquals(4, result)
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem0704()
        val result = problem.search(intArrayOf(-1, 0, 3, 5, 9, 12), 2)
        assertEquals(-1, result)
    }
}