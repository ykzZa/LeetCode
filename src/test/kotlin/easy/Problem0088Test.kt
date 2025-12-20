package easy

import org.testng.annotations.Test
import kotlin.test.assertContentEquals

class Problem0088Test {

    @Test
    fun testExampleOne() {
        val problem = Problem0088()
        val nums1 = intArrayOf(1, 2, 3, 0, 0, 0)
        val nums2 = intArrayOf(2, 5, 6)
        problem.merge(nums1, 3, nums2, 3)
        assertContentEquals(intArrayOf(1, 2, 2, 3, 5, 6), nums1)
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem0088()
        val nums1 = intArrayOf(1)
        val nums2 = intArrayOf()
        problem.merge(nums1, 1, nums2, 0)
        assertContentEquals(intArrayOf(1), nums1)
    }

    @Test
    fun testExampleThree() {
        val problem = Problem0088()
        val nums1 = intArrayOf(0)
        val nums2 = intArrayOf(1)
        problem.merge(nums1, 0, nums2, 1)
        assertContentEquals(intArrayOf(1), nums1)
    }

    @Test
    fun testExampleFour() {
        val problem = Problem0088()
        val nums1 = intArrayOf(4, 5, 6, 0, 0, 0)
        val nums2 = intArrayOf(1, 2, 3)
        problem.merge(nums1, 3, nums2, 3)
        assertContentEquals(intArrayOf(1, 2, 3, 4, 5, 6), nums1)
    }
}