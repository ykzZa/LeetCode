package easy

import org.testng.annotations.Test
import kotlin.test.assertContentEquals

class Problem0001Test {

    @Test
    fun testExampleOne() {
        val problem = Problem0001()
        val result = problem.twoSum(intArrayOf(2, 7, 11, 15), 9).sortedArray()
        assertContentEquals(intArrayOf(0, 1), result)
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem0001()
        val result = problem.twoSum(intArrayOf(3, 2, 4), 6).sortedArray()
        assertContentEquals(intArrayOf(1, 2), result)
    }

    @Test
    fun testExampleThree() {
        val problem = Problem0001()
        val result = problem.twoSum(intArrayOf(3, 3), 6).sortedArray()
        assertContentEquals(intArrayOf(0, 1), result)
    }
}
