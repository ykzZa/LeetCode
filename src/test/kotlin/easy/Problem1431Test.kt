package easy

import org.testng.annotations.Test
import kotlin.test.assertContentEquals

class Problem1431Test {

    @Test
    fun testExampleOne() {
        val problem = Problem1431()
        val result = problem.kidsWithCandies(
            intArrayOf(2, 3, 5, 1, 3),
            3
        )
        assertContentEquals(listOf(true, true, true, false, true), result)
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem1431()
        val result = problem.kidsWithCandies(
            intArrayOf(4, 2, 1, 1, 2),
            1
        )
        assertContentEquals(listOf(true, false, false, false, false), result)
    }

    @Test
    fun testExampleThree() {
        val problem = Problem1431()
        val result = problem.kidsWithCandies(
            intArrayOf(12, 1, 12),
            10
        )
        assertContentEquals(listOf(true, false, true), result)
    }
}