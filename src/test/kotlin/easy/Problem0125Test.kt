package easy

import org.testng.annotations.Test
import kotlin.test.assertEquals

class Problem0125Test {

    @Test
    fun testExampleOne() {
        val problem = Problem0125()
        val result = problem.isPalindrome("A man, a plan, a canal: Panama")
        assertEquals(true, result)
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem0125()
        val result = problem.isPalindrome("race a car")
        assertEquals(false, result)
    }

    @Test
    fun testExampleThree() {
        val problem = Problem0125()
        val result = problem.isPalindrome(" ")
        assertEquals(true, result)
    }
}