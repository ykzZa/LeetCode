package medium

import org.testng.annotations.Test
import kotlin.test.assertEquals

class Problem0050Test {

    @Test
    fun testExampleOne() {
        val problem = Problem0050()
        val result = problem.myPow(2.0, 10)
        assertEquals(1024.0, result)
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem0050()
        val result = problem.myPow(2.1, 3)
        assertEquals(9.261, result, 0.0001)
    }

    @Test
    fun testExampleThree() {
        val problem = Problem0050()
        val result = problem.myPow(2.0, -2)
        assertEquals(0.25, result)
    }
}