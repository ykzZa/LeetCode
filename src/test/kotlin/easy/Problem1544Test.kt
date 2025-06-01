package easy

import org.testng.annotations.Test
import kotlin.test.assertEquals

class Problem1544Test {

    @Test
    fun testExampleOne() {
        val problem = Problem1544()
        val result = problem.makeGood("leEeetcode")
        assertEquals("leetcode", result)
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem1544()
        val result = problem.makeGood("abBAcC")
        assertEquals("", result)
    }

    @Test
    fun testExampleThree() {
        val problem = Problem1544()
        val result = problem.makeGood("s")
        assertEquals("s", result)
    }
}