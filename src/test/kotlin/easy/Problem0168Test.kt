package easy

import org.testng.annotations.Test
import kotlin.test.assertEquals

class Problem0168Test {

    @Test
    fun testExampleOne() {
        val problem = Problem0168()
        val result = problem.convertToTitle(1)
        assertEquals("A", result)
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem0168()
        val result = problem.convertToTitle(28)
        assertEquals("AB", result)
    }

    @Test
    fun testExampleThree() {
        val problem = Problem0168()
        val result = problem.convertToTitle(701)
        assertEquals("ZY", result)
    }
}