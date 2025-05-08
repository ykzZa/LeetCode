package easy

import org.testng.annotations.Test
import kotlin.test.assertEquals

class Problem1672Test {

    @Test
    fun testExampleOne() {
        val problem = Problem1672()
        val result = problem.maximumWealth(arrayOf(intArrayOf(1,2,3), intArrayOf(3,2,1)))
        assertEquals(6, result)
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem1672()
        val result = problem.maximumWealth(arrayOf(intArrayOf(1,5), intArrayOf(7,3), intArrayOf(3,5)))
        assertEquals(10, result)
    }

    @Test
    fun testExampleThree() {
        val problem = Problem1672()
        val result = problem.maximumWealth(arrayOf(intArrayOf(2,8,7), intArrayOf(7,1,3), intArrayOf(1,9,5)))
        assertEquals(17, result)
    }
}