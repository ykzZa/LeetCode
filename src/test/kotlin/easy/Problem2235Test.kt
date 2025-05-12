package easy

import org.testng.annotations.Test
import kotlin.test.assertEquals

class Problem2235Test {

    @Test
    fun testExampleOne() {
        val problem = Problem2235()
        val result = problem.sum(12, 5)
        assertEquals(17, result)
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem2235()
        val result = problem.sum(-10, 4)
        assertEquals(-6, result)
    }
}