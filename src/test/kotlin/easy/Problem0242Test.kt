package easy

import org.testng.annotations.Test
import kotlin.test.assertEquals

class Problem0242Test {

    @Test
    fun testExampleOne() {
        val problem = Problem0242()
        val result = problem.isAnagram("anagram", "nagaram")
        assertEquals(true, result)
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem0242()
        val result = problem.isAnagram("rat", "car")
        assertEquals(false, result)
    }
}