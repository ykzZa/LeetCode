package easy

import org.testng.annotations.Test
import kotlin.test.assertEquals

class Problem1684Test {

    @Test
    fun testExampleOne() {
        val problem = Problem1684()
        val result = problem.countConsistentStrings(
            "ab",
            arrayOf("ad","bd","aaab","baa","badab")
        )
        assertEquals(2, result)
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem1684()
        val result = problem.countConsistentStrings(
            "abc",
            arrayOf("a","b","c","ab","ac","bc","abc")
        )
        assertEquals(7, result)
    }

    @Test
    fun testExampleThree() {
        val problem = Problem1684()
        val result = problem.countConsistentStrings(
            "cad",
            arrayOf("cc","acd","b","ba","bac","bad","ac","d")
        )
        assertEquals(4, result)
    }
}