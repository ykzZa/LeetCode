package easy

import org.testng.annotations.Test
import kotlin.test.assertEquals

class Problem3340Test {

    @Test
    fun testExampleOne() {
        val problem = Problem3340()
        val result = problem.isBalanced("1234")
        assertEquals(false, result)
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem3340()
        val result = problem.isBalanced("24123")
        assertEquals(true, result)
    }
}