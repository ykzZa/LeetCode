package medium

import org.testng.annotations.Test
import kotlin.test.assertEquals

class Problem2396Test {

    @Test
    fun testExampleOne() {
        val problem = Problem2396()
        val result = problem.isStrictlyPalindromic(9)
        assertEquals(false, result)
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem2396()
        val result = problem.isStrictlyPalindromic(4)
        assertEquals(false, result)
    }
}