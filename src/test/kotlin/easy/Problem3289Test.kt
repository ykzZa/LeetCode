package easy

import org.testng.annotations.Test
import kotlin.test.assertContentEquals

class Problem3289Test {

    @Test
    fun testExampleOne() {
        val problem = Problem3289()
        val result = problem.getSneakyNumbers(intArrayOf(0,1,1,0))
        assertContentEquals(intArrayOf(0,1), result.sortedArray())
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem3289()
        val result = problem.getSneakyNumbers(intArrayOf(0,3,2,1,3,2))
        assertContentEquals(intArrayOf(2,3), result.sortedArray())
    }

    @Test
    fun testExampleThree() {
        val problem = Problem3289()
        val result = problem.getSneakyNumbers(intArrayOf(7,1,5,4,3,4,6,0,9,5,8,2))
        assertContentEquals(intArrayOf(4,5), result.sortedArray())
    }
}