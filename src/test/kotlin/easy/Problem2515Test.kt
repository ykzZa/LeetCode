package easy

import org.testng.annotations.Test
import kotlin.test.assertEquals

class Problem2515Test {

    @Test
    fun testExampleOne() {
        val problem = Problem2515()
        val result = problem.closestTarget(arrayOf("hello","i","am","leetcode","hello"), "hello", 1)
        assertEquals(1, result)
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem2515()
        val result = problem.closestTarget(arrayOf("a","b","leetcode"), "leetcode", 0)
        assertEquals(1, result)
    }

    @Test
    fun testExampleThree() {
        val problem = Problem2515()
        val result = problem.closestTarget(arrayOf("i","eat","leetcode"), "ate", 0)
        assertEquals(-1, result)
    }
}