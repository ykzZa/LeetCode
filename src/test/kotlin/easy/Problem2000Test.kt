package easy

import org.testng.annotations.Test
import kotlin.test.assertEquals

class Problem2000Test {

    @Test
    fun testExampleOne() {
        val problem = Problem2000()
        val result = problem.reversePrefix("abcdefd", 'd')
        assertEquals("dcbaefd", result)
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem2000()
        val result = problem.reversePrefix("xyxzxe", 'z')
        assertEquals("zxyxxe", result)
    }

    @Test
    fun testExampleThree() {
        val problem = Problem2000()
        val result = problem.reversePrefix("abcd", 'z')
        assertEquals("abcd", result)
    }
}