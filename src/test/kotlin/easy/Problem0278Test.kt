package easy

import org.testng.annotations.Test
import kotlin.test.assertEquals

class Problem0278Test {

    @Test
    fun testExampleOne() {
        val problem = Problem0278 {
            it >= 4
        }
        val result = problem.firstBadVersion(5)
        assertEquals(4, result)
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem0278 {
            true
        }
        val result = problem.firstBadVersion(1)
        assertEquals(1, result)
    }
}