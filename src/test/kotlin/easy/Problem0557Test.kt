package easy

import org.testng.annotations.Test
import kotlin.test.assertEquals

class Problem0557Test {

    @Test
    fun testExampleOne() {
        val problem = Problem0557()
        val result = problem.reverseWords("Let's take LeetCode contest")
        assertEquals("s'teL ekat edoCteeL tsetnoc", result)
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem0557()
        val result =  problem.reverseWords("Mr Ding")
        assertEquals("rM gniD", result)
    }
}