package easy

import org.testng.annotations.Test
import kotlin.test.assertEquals

class Problem2894Test {

    @Test
    fun testExampleOne() {
        val problem = Problem2894()
        val result = problem.differenceOfSums(10, 3)
        assertEquals(19, result)
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem2894()
        val result = problem.differenceOfSums(5, 6)
        assertEquals(15, result)
    }

    @Test
    fun testExampleThree() {
        val problem = Problem2894()
        val result = problem.differenceOfSums(5, 1)
        assertEquals(-15, result)
    }
}