package easy

import org.testng.annotations.Test
import kotlin.test.assertContentEquals

class Problem3467Test {

    @Test
    fun testExampleOne() {
        val problem = Problem3467()
        val result = problem.transformArray(intArrayOf(4,3,2,1))
        assertContentEquals(intArrayOf(0,0,1,1), result)
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem3467()
        val result = problem.transformArray(intArrayOf(1,5,1,4,2))
        assertContentEquals(intArrayOf(0,0,1,1,1), result)
    }
}