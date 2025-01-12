package easy

import org.testng.annotations.Test
import kotlin.test.assertEquals

class Problem0367Test {

    @Test
    fun testExampleOne() {
        val problem = Problem0367()
        val result = problem.isPerfectSquare(16)
        assertEquals(true, result)
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem0367()
        val result = problem.isPerfectSquare(14)
        assertEquals(false, result)
    }

    @Test
    fun testExampleThree() {
        val problem = Problem0367()
        val result = problem.isPerfectSquare(2147483647)
        assertEquals(false, result)
    }
}