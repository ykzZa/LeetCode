package easy

import org.testng.annotations.Test
import kotlin.test.assertTrue

class Problem0832Test {

    @Test
    fun testExampleOne() {
        val problem = Problem0832()
        val result = problem.flipAndInvertImage(
            arrayOf(
                intArrayOf(1, 1, 0),
                intArrayOf(1, 0, 1),
                intArrayOf(0, 0, 0)
            )
        )
        assertTrue(
            result.contentDeepEquals(
                arrayOf(
                    intArrayOf(1, 0, 0),
                    intArrayOf(0, 1, 0),
                    intArrayOf(1, 1, 1)
                )
            )
        )
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem0832()
        val result = problem.flipAndInvertImage(
            arrayOf(
                intArrayOf(1, 1, 0, 0),
                intArrayOf(1, 0, 0, 1),
                intArrayOf(0, 1, 1, 1),
                intArrayOf(1, 0, 1, 0)
            )
        )
        assertTrue(
            result.contentDeepEquals(
                arrayOf(
                    intArrayOf(1, 1, 0, 0),
                    intArrayOf(0, 1, 1, 0),
                    intArrayOf(0, 0, 0, 1),
                    intArrayOf(1, 0, 1, 0)
                )
            )
        )
    }
}