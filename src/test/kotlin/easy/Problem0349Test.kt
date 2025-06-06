package easy

import org.testng.annotations.Test
import kotlin.test.assertContentEquals

class Problem0349Test {

    @Test
    fun testExampleOne() {
        val problem = Problem0349()
        val result = problem.intersection(intArrayOf(1, 2, 2, 1), intArrayOf(2, 2))
        assertContentEquals(intArrayOf(2).sortedArray(), result.sortedArray())
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem0349()
        val result = problem.intersection(intArrayOf(4, 9, 5), intArrayOf(9, 4, 9, 8, 4))
        assertContentEquals(intArrayOf(9, 4).sortedArray(), result.sortedArray())
    }
}