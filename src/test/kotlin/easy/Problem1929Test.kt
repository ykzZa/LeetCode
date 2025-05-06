package easy

import org.testng.annotations.Test
import kotlin.test.assertContentEquals

class Problem1929Test {

    @Test
    fun testExampleOne() {
        val problem = Problem1929()
        val result = problem.getConcatenation(intArrayOf(1, 2, 1))
        assertContentEquals(intArrayOf(1, 2, 1, 1, 2, 1), result)
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem1929()
        val result = problem.getConcatenation(intArrayOf(1, 3, 2, 1))
        assertContentEquals(intArrayOf(1, 3, 2, 1, 1, 3, 2, 1), result)
    }
}