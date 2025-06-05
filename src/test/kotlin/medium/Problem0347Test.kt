package medium

import org.testng.annotations.Test
import kotlin.test.assertContentEquals

class Problem0347Test {

    @Test
    fun testExampleOne() {
        val problem = Problem0347()
        val result = problem.topKFrequent(intArrayOf(1, 1, 1, 2, 2, 3), 2)
        assertContentEquals(intArrayOf(1, 2), result.sortedArray())
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem0347()
        val result = problem.topKFrequent(intArrayOf(1), 1)
        assertContentEquals(intArrayOf(1), result.sortedArray())
    }
}