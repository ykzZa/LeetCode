package easy

import org.testng.annotations.Test
import kotlin.test.assertContentEquals

class Problem0066Test {

    @Test
    fun testExampleOne() {
        val problem = Problem0066()
        val result = problem.plusOne(intArrayOf(1, 2, 3))
        assertContentEquals(intArrayOf(1, 2, 4), result)
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem0066()
        val result = problem.plusOne(intArrayOf(4, 3, 2, 1))
        assertContentEquals(intArrayOf(4, 3, 2, 2), result)
    }

    @Test
    fun testExampleThree() {
        val problem = Problem0066()
        val result = problem.plusOne(intArrayOf(1, 2, 9))
        assertContentEquals(intArrayOf(1, 3, 0), result)
    }

    @Test
    fun testExampleFour() {
        val problem = Problem0066()
        val result = problem.plusOne(intArrayOf(9, 9, 9, 9))
        assertContentEquals(intArrayOf(1, 0, 0, 0, 0), result)
    }
}