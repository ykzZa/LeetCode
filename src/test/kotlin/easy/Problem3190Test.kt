package easy

import org.testng.annotations.Test
import kotlin.test.assertEquals

class Problem3190Test {

    @Test
    fun testExampleOne() {
        val problem = Problem3190()
        val result = problem.minimumOperations(intArrayOf(1,2,3,4))
        assertEquals(3, result)
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem3190()
        val result = problem.minimumOperations(intArrayOf(3,6,9))
        assertEquals(0, result)
    }
}