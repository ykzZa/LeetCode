package easy

import org.testng.annotations.Test
import kotlin.test.assertEquals

class Problem0268Test {

    @Test
    fun testExampleOne() {
        val problem = Problem0268()
        val result = problem.missingNumber(intArrayOf(3, 0, 1))
        assertEquals(2, result)
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem0268()
        val result = problem.missingNumber(intArrayOf(0, 1))
        assertEquals(2, result)
    }

    @Test
    fun testExampleThree() {
        val problem = Problem0268()
        val result = problem.missingNumber(intArrayOf(9, 6, 4, 2, 3, 5, 7, 0, 1))
        assertEquals(8, result)
    }
}