package easy

import org.testng.annotations.Test
import kotlin.test.assertContentEquals

class Problem1920Test {

    @Test
    fun testExampleOne() {
        val problem = Problem1920()
        val result = problem.buildArray(intArrayOf(0,2,1,5,3,4))
        assertContentEquals(intArrayOf(0,1,2,4,5,3), result)
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem1920()
        val result = problem.buildArray(intArrayOf(5,0,1,2,3,4))
        assertContentEquals(intArrayOf(4,5,0,1,2,3), result)
    }
}