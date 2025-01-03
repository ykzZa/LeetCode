package easy

import org.testng.annotations.Test
import kotlin.test.assertEquals

class Problem0020Test {

    @Test
    fun testExampleOne() {
        val problem = Problem0020()
        val result = problem.isValid("()")
        assertEquals(true, result)
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem0020()
        val result = problem.isValid("()[]{}")
        assertEquals(true, result)
    }

    @Test
    fun testExampleThree() {
        val problem = Problem0020()
        val result = problem.isValid("(]")
        assertEquals(false, result)
    }

    @Test
    fun testExampleFour() {
        val problem = Problem0020()
        val result = problem.isValid("([])")
        assertEquals(true, result)
    }
}