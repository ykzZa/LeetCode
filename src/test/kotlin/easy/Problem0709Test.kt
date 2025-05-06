package easy

import org.testng.annotations.Test
import kotlin.test.assertEquals

class Problem0709Test {

    @Test
    fun testExampleOne() {
        val problem = Problem0709()
        val result = problem.toLowerCase("Hello")
        assertEquals("hello", result)
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem0709()
        val result =  problem.toLowerCase("here")
        assertEquals("here", result)
    }

    @Test
    fun testExampleThree() {
        val problem = Problem0709()
        val result =  problem.toLowerCase("LOVELY")
        assertEquals("lovely", result)
    }
}