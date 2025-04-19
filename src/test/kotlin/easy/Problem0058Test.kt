package easy

import org.testng.annotations.Test
import kotlin.test.assertEquals

class Problem0058Test {

    @Test
    fun testExampleOne() {
        val problem = Problem0058()
        val result = problem.lengthOfLastWord("Hello World")
        assertEquals(5, result)
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem0058()
        val result = problem.lengthOfLastWord("   fly me   to   the moon  ")
        assertEquals(4, result)
    }

    @Test
    fun testExampleThree() {
        val problem = Problem0058()
        val result = problem.lengthOfLastWord("luffy is still joyboy")
        assertEquals(6, result)
    }
}