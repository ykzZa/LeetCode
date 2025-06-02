package easy

import org.testng.annotations.Test
import kotlin.test.assertEquals

class Problem0217Test {

    @Test
    fun testExampleOne() {
        val problem = Problem0217()
        val result = problem.containsDuplicate(intArrayOf(1, 2, 3, 1))
        assertEquals(true, result)
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem0217()
        val result = problem.containsDuplicate(intArrayOf(1, 2, 3, 4))
        assertEquals(false, result)
    }

    @Test
    fun testExampleThree() {
        val problem = Problem0217()
        val result = problem.containsDuplicate(intArrayOf(1, 1, 1, 3, 3, 4, 3, 2, 4, 2))
        assertEquals(true, result)
    }
}