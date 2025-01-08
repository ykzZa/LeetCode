package easy

import org.testng.annotations.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class Problem0026Test {

    @Test
    fun testExampleOne() {
        val problem = Problem0026()
        val nums = intArrayOf(1, 1, 2)
        val expectedNums = intArrayOf(1, 2)
        val k = problem.removeDuplicates(nums)
        assertEquals(expectedNums.size, k)
        assertContentEquals(expectedNums, nums.copyOf(k))
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem0026()
        val nums = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
        val expectedNums = intArrayOf(0, 1, 2, 3, 4)
        val k = problem.removeDuplicates(nums)
        assertEquals(expectedNums.size, k)
        assertContentEquals(expectedNums, nums.copyOf(k))
    }
}