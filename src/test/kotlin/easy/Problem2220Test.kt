package easy

import org.testng.annotations.Test
import kotlin.test.assertEquals

class Problem2220Test {

    @Test
    fun testExampleOne() {
        val problem = Problem2220()
        val result = problem.minBitFlips(10, 7)
        assertEquals(3, result)
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem2220()
        val result = problem.minBitFlips(3, 4)
        assertEquals(3, result)
    }
}