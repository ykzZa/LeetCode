package easy

import org.testng.annotations.Test
import kotlin.test.assertEquals

class Problem2185Test {

    @Test
    fun testExampleOne() {
        val problem = Problem2185()
        val result = problem.prefixCount(arrayOf("pay","attention","practice","attend"), "at")
        assertEquals(2, result)
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem2185()
        val result = problem.prefixCount(arrayOf("leetcode","win","loops","success"), "code")
        assertEquals(0, result)
    }
}