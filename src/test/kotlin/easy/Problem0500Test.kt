package easy

import org.testng.annotations.Test
import kotlin.test.assertContentEquals

class Problem0500Test {

    @Test
    fun testExampleOne() {
        val problem = Problem0500()
        val result = problem.findWords(arrayOf("Hello", "Alaska", "Dad", "Peace"))
        assertContentEquals(arrayOf("Alaska", "Dad"), result)
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem0500()
        val result = problem.findWords(arrayOf("omk"))
        assertContentEquals(arrayOf(), result)
    }

    @Test
    fun testExampleThree() {
        val problem = Problem0500()
        val result = problem.findWords(arrayOf("adsdf", "sfd"))
        assertContentEquals(arrayOf("adsdf", "sfd"), result)
    }
}