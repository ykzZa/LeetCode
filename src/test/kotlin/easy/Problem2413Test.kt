package easy

import org.testng.annotations.Test
import kotlin.test.assertEquals

class Problem2413Test {

    @Test
    fun testExampleOne() {
        val problem = Problem2413()
        val result = problem.smallestEvenMultiple(5)
        assertEquals(10, result)
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem2413()
        val result = problem.smallestEvenMultiple(6)
        assertEquals(6, result)
    }
}