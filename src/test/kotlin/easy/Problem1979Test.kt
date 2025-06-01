package easy

import org.testng.annotations.Test
import kotlin.test.assertEquals

class Problem1979Test {

    @Test
    fun testExampleOne() {
        val problem = Problem1979()
        val result = problem.findGCD(intArrayOf(2, 5, 6, 9, 10))
        assertEquals(2, result)
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem1979()
        val result = problem.findGCD(intArrayOf(7, 5, 6, 8, 3))
        assertEquals(1, result)
    }

    @Test
    fun testExampleThree() {
        val problem = Problem1979()
        val result = problem.findGCD(intArrayOf(3, 3))
        assertEquals(3, result)
    }
}