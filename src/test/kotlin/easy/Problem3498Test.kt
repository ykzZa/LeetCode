package easy

import org.testng.annotations.Test
import kotlin.test.assertEquals

class Problem3498Test {

    @Test
    fun testExampleOne() {
        val problem = Problem3498()
        val result = problem.reverseDegree("abc")
        assertEquals(148, result)
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem3498()
        val result = problem.reverseDegree("zaza")
        assertEquals(160, result)
    }
}