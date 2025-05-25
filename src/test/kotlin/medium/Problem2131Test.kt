package medium

import org.testng.annotations.Test
import kotlin.test.assertEquals

class Problem2131Test {

    @Test
    fun testExampleOne() {
        val problem = Problem2131()
        val result = problem.longestPalindrome(arrayOf("lc","cl","gg"))
        assertEquals(6, result)
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem2131()
        val result = problem.longestPalindrome(arrayOf("ab","ty","yt","lc","cl","ab"))
        assertEquals(8, result)
    }

    @Test
    fun testExampleThree() {
        val problem = Problem2131()
        val result = problem.longestPalindrome(arrayOf("cc","ll","xx"))
        assertEquals(2, result)
    }
}