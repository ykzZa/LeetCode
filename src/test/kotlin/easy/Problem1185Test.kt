package easy

import org.testng.annotations.Test
import kotlin.test.assertEquals

class Problem1185Test {

    @Test
    fun testExampleOne() {
        val problem = Problem1185()
        val result = problem.dayOfTheWeek(
            31,
            8,
            2019
        )
        assertEquals("Saturday", result)
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem1185()
        val result = problem.dayOfTheWeek(
            18,
            7,
            1999
        )
        assertEquals("Sunday", result)
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