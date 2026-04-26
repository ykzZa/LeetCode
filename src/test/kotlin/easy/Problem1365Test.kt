package easy

import org.testng.annotations.Test
import kotlin.test.assertContentEquals

class Problem1365Test {

    @Test
    fun testExampleOne() {
        val problem = Problem1365()
        val result = problem.smallerNumbersThanCurrent(
            intArrayOf(8, 1, 2, 2, 3)
        )
        assertContentEquals(intArrayOf(4, 0, 1, 1, 3), result)
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem1365()
        val result = problem.smallerNumbersThanCurrent(
            intArrayOf(6, 5, 4, 8)
        )
        assertContentEquals(intArrayOf(2, 1, 0, 3), result)
    }

    @Test
    fun testExampleThree() {
        val problem = Problem1365()
        val result = problem.smallerNumbersThanCurrent(
            intArrayOf(7, 7, 7, 7)
        )
        assertContentEquals(intArrayOf(0, 0, 0, 0), result)
    }
}