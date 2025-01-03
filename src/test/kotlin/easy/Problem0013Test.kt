package easy

import org.testng.annotations.Test
import kotlin.test.assertEquals

class Problem0013Test {

    @Test
    fun testExampleOne() {
        val problem = Problem0013()
        val result = problem.romanToInt("III")
        assertEquals(3, result)
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem0013()
        val result = problem.romanToInt("LVIII")
        assertEquals(58, result)
    }

    @Test
    fun testExampleThree() {
        val problem = Problem0013()
        val result = problem.romanToInt("MCMXCIV")
        assertEquals(1994, result)
    }
}