package easy

import org.testng.annotations.Test
import kotlin.test.assertEquals

class Problem0009Test {

    @Test
    fun testExampleOne() {
        val problem = Problem0009()
        val result = problem.isPalindrome(121)
        assertEquals(true, result)
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem0009()
        val result = problem.isPalindrome(-121)
        assertEquals(false, result)
    }

    @Test
    fun testExampleThree() {
        val problem = Problem0009()
        val result = problem.isPalindrome(10)
        assertEquals(false, result)
    }
}