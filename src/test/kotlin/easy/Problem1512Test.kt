package easy

import org.testng.annotations.Test
import kotlin.test.assertEquals

class Problem1512Test {

    @Test
    fun testExampleOne() {
        val problem = Problem1512()
        val result = problem.numIdenticalPairs(intArrayOf(1,2,3,1,1,3))
        assertEquals(4, result)
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem1512()
        val result = problem.numIdenticalPairs(intArrayOf(1,1,1,1))
        assertEquals(6, result)
    }

    @Test
    fun testExampleThree() {
        val problem = Problem1512()
        val result = problem.numIdenticalPairs(intArrayOf(1,2,3))
        assertEquals(0, result)
    }
}