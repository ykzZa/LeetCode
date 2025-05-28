package easy

import org.testng.annotations.Test
import kotlin.test.assertEquals

class Problem1154Test {

    @Test
    fun testExampleOne() {
        val problem = Problem1154()
        val result = problem.dayOfYear("2019-01-09")
        assertEquals(9, result)
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem1154()
        val result = problem.dayOfYear("2019-02-10")
        assertEquals(41, result)
    }
}