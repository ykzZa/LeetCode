package easy

import org.testng.annotations.Test
import kotlin.test.assertEquals

class Problem3718Test {

    @Test
    fun testExampleOne() {
        val problem = Problem3718()
        val result = problem.missingMultiple(intArrayOf(8, 2, 3, 4 , 6), 2)
        assertEquals(10, result)
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem3718()
        val result = problem.missingMultiple(intArrayOf(1, 4, 7, 10 , 15), 5)
        assertEquals(5, result)
    }
}