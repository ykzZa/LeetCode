package easy

import org.testng.annotations.Test
import kotlin.test.assertEquals

class Problem3280Test {

    @Test
    fun testExampleOne() {
        val problem = Problem3280()
        val result = problem.convertDateToBinary("2080-02-29")
        assertEquals("100000100000-10-11101", result)
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem3280()
        val result = problem.convertDateToBinary("1900-01-01")
        assertEquals("11101101100-1-1", result)
    }
}