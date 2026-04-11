package easy

import org.testng.annotations.Test
import kotlin.test.assertEquals

class Problem1351Test {

    @Test
    fun testExampleOne() {
        val problem = Problem1351()
        val result = problem.countNegatives(
            arrayOf(
                intArrayOf(4, 3, 2, -1),
                intArrayOf(3, 2, 1, -1),
                intArrayOf(1, 1, -1, -2),
                intArrayOf(-1, -1, -2, -3)
            )
        )
        assertEquals(8, result)
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem1351()
        val result = problem.countNegatives(
            arrayOf(
                intArrayOf(3, 2),
                intArrayOf(1, 0)
            )
        )
        assertEquals(0, result)
    }

    @Test
    fun testExampleThree() {
        val problem = Problem1185()
        val result = problem.dayOfTheWeek(
            15,
            8,
            1993
        )
        assertEquals("Sunday", result)
    }
}