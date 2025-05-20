package easy

import org.testng.annotations.Test
import kotlin.test.assertEquals

class Problem2824Test {

    @Test
    fun testExampleOne() {
        val problem = Problem2824()
        val result = problem.countPairs(
            listOf(-1, 1, 2, 3, 1), 2
        )
        assertEquals(3, result)
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem2824()
        val result = problem.countPairs(
            listOf(-6, 2, 5, -2, -7, -1, 3), -2
        )
        assertEquals(10, result)
    }
}