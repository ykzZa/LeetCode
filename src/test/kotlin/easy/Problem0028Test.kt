package easy

import org.testng.annotations.Test
import kotlin.test.assertEquals

class Problem0028Test {

    @Test
    fun testExampleOne() {
        val problem = Problem0028()
        val result = problem.strStr("sadbutsad", "sad")
        assertEquals(0, result)
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem0028()
        val result = problem.strStr("leetcode", "leeto")
        assertEquals(-1, result)
    }
}