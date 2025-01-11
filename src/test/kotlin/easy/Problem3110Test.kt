package easy

import org.testng.annotations.Test
import kotlin.test.assertEquals

class Problem3110Test {

    @Test
    fun testExampleOne() {
        val problem = Problem3110()
        val result = problem.scoreOfString("hello")
        assertEquals(13, result)
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem3110()
        val result = problem.scoreOfString("zaz")
        assertEquals(50, result)
    }
}