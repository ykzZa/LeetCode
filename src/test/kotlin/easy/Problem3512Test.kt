package easy

import org.testng.annotations.Test
import kotlin.test.assertEquals

class Problem3512Test {

    @Test
    fun testExampleOne() {
        val problem = Problem3512()
        val result = problem.minOperations(intArrayOf(3,9,7), 5)
        assertEquals(4, result)
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem3512()
        val result = problem.minOperations(intArrayOf(4,1,3), 4)
        assertEquals(0, result)
    }

    @Test
    fun testExampleThree() {
        val problem = Problem3512()
        val result = problem.minOperations(intArrayOf(3,2), 6)
        assertEquals(5, result)
    }
}