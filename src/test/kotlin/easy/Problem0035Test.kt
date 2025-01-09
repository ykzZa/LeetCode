package easy

import org.testng.annotations.Test
import kotlin.test.assertEquals

class Problem0035Test {

    @Test
    fun testExampleOne() {
        val problem = Problem0035()
        val result = problem.searchInsert(intArrayOf(1,3,5,6), 5)
        assertEquals(2, result)
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem0035()
        val result = problem.searchInsert(intArrayOf(1,3,5,6), 2)
        assertEquals(1, result)
    }

    @Test
    fun testExampleThree() {
        val problem = Problem0035()
        val result = problem.searchInsert(intArrayOf(1,3,5,6), 7)
        assertEquals(4, result)
    }
}