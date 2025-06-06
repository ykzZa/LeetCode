package easy

import org.testng.annotations.Test
import kotlin.test.assertContentEquals

class Problem2574Test {

    @Test
    fun testExampleOne() {
        val problem = Problem2574()
        val result = problem.leftRightDifference(intArrayOf(10, 4, 8, 3))
        assertContentEquals(intArrayOf(15, 1, 11, 22), result)
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem2574()
        val result = problem.leftRightDifference(intArrayOf(1))
        assertContentEquals(intArrayOf(0), result)
    }
}