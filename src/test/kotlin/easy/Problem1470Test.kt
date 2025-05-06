package easy

import org.testng.annotations.Test
import kotlin.test.assertContentEquals

class Problem1470Test {

    @Test
    fun testExampleOne() {
        val problem = Problem1470()
        val result = problem.shuffle(intArrayOf(2,5,1,3,4,7), 3)
        assertContentEquals(intArrayOf(2,3,5,4,1,7), result)
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem1470()
        val result = problem.shuffle(intArrayOf(1,2,3,4,4,3,2,1), 4)
        assertContentEquals(intArrayOf(1,4,2,3,3,2,4,1), result)
    }

    @Test
    fun testExampleThree() {
        val problem = Problem1470()
        val result = problem.shuffle(intArrayOf(1,1,2,2), 2)
        assertContentEquals(intArrayOf(1,2,1,2), result)
    }
}