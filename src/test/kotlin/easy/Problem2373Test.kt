package easy

import org.testng.annotations.Test
import kotlin.test.assertTrue

class Problem2373Test {

    @Test
    fun testExampleOne() {
        val problem = Problem2373()
        val result = problem.largestLocal(
            arrayOf(
                intArrayOf(9, 9, 8, 1),
                intArrayOf(5, 6, 2, 6),
                intArrayOf(8, 2, 6, 4),
                intArrayOf(6, 2, 2, 2)
            )
        )
        assertTrue(
            result.contentDeepEquals(
                arrayOf(
                    intArrayOf(9, 9),
                    intArrayOf(8, 6)
                )
            )
        )
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem2373()
        val result = problem.largestLocal(
            arrayOf(
                intArrayOf(1, 1, 1, 1, 1),
                intArrayOf(1, 1, 1, 1, 1),
                intArrayOf(1, 1, 2, 1, 1),
                intArrayOf(1, 1, 1, 1, 1),
                intArrayOf(1, 1, 1, 1, 1)
            )
        )
        assertTrue(
            result.contentDeepEquals(arrayOf(
                intArrayOf(2, 2, 2),
                intArrayOf(2, 2, 2),
                intArrayOf(2, 2, 2)
            ))
        )
    }
}