package easy

import org.testng.annotations.Test
import kotlin.test.assertEquals

class Problem2798Test {

    @Test
    fun testExampleOne() {
        val problem = Problem2798()
        val result = problem.numberOfEmployeesWhoMetTarget(
            intArrayOf(0, 1, 2, 3, 4), 2
        )
        assertEquals(3, result)
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem2798()
        val result = problem.numberOfEmployeesWhoMetTarget(
            intArrayOf(5,1,4,2,2), 6
        )
        assertEquals(0, result)
    }
}