package easy

import org.testng.annotations.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class Problem0027Test {

    @Test
    fun testExampleOne() {
        val problem = Problem0027()
        val nums = intArrayOf(3, 2, 2, 3)
        val expectedNums = intArrayOf(2, 2)
        val k = problem.removeElement(nums, 3)
        assertEquals(expectedNums.size, k)
        assertContentEquals(expectedNums.sorted(), nums.copyOf(k).sorted())
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem0027()
        val nums = intArrayOf(0, 1, 2, 2, 3, 0, 4, 2)
        val expectedNums = intArrayOf(0, 1, 3, 0, 4)
        val k = problem.removeElement(nums, 2)
        assertEquals(expectedNums.size, k)
        assertContentEquals(expectedNums.sorted(), nums.copyOf(k).sorted())
    }
}