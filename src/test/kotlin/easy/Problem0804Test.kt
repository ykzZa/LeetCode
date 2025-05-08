package easy

import org.testng.annotations.Test
import kotlin.test.assertEquals

class Problem0804Test {

    @Test
    fun testExampleOne() {
        val problem = Problem0804()
        val result = problem.uniqueMorseRepresentations(arrayOf("gin", "zen", "gig", "msg"))
        assertEquals(2, result)
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem0804()
        val result = problem.uniqueMorseRepresentations(arrayOf("a"))
        assertEquals(1, result)
    }
}