package easy

import org.testng.annotations.Test
import kotlin.test.assertEquals

class Problem2652Test {

    @Test
    fun testExampleOne() {
        val problem = Problem2652()
        val result = problem.sumOfMultiples(7)
        assertEquals(21, result)
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem2652()
        val result = problem.sumOfMultiples(10)
        assertEquals(40, result)
    }

    @Test
    fun testExampleThree() {
        val problem = Problem2652()
        val result = problem.sumOfMultiples(9)
        assertEquals(30, result)
    }
}