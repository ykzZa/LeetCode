package easy

import org.testng.annotations.Test
import kotlin.test.assertContentEquals

class Problem0448Test {

    @Test
    fun testExampleOne() {
        val problem = Problem0448()
        val result = problem.findDisappearedNumbers(intArrayOf(4, 3, 2, 7, 8, 2, 3, 1))
        assertContentEquals(listOf(5, 6), result)
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem0448()
        val result = problem.findDisappearedNumbers(intArrayOf(1, 1))
        assertContentEquals(listOf(2), result)
    }
}