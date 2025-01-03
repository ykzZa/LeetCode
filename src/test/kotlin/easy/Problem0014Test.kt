package easy

import org.testng.annotations.Test
import kotlin.test.assertEquals

class Problem0014Test {

    @Test
    fun testExampleOne() {
        val problem = Problem0014()
        val result = problem.longestCommonPrefix(arrayOf("flower", "flow", "flight"))
        assertEquals("fl", result)
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem0014()
        val result = problem.longestCommonPrefix(arrayOf("dog", "racecar", "car"))
        assertEquals("", result)
    }

    @Test
    fun testExampleThree() {
        val problem = Problem0014()
        val result = problem.longestCommonPrefix(arrayOf("d"))
        assertEquals("d", result)
    }

    @Test
    fun testExampleFour() {
        val problem = Problem0014()
        val result = problem.longestCommonPrefix(arrayOf("d", "b"))
        assertEquals("", result)
    }

    @Test
    fun testExampleFive() {
        val problem = Problem0014()
        val result = problem.longestCommonPrefix(arrayOf("flower","flower","flower","flower"))
        assertEquals("flower", result)
    }
}