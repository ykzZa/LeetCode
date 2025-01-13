package easy

import org.testng.annotations.Test
import kotlin.test.assertEquals

class Problem0069Test {

    @Test
    fun testExampleOne() {
        val problem = Problem0069()
        val result = problem.mySqrt(4)
        assertEquals(2, result)
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem0069()
        val result = problem.mySqrt(8)
        assertEquals(2, result)
    }
}