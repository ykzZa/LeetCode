package easy

import org.testng.annotations.Test
import kotlin.test.assertEquals

class Problem0507Test {

    @Test
    fun testExampleOne() {
        val problem = Problem0507()
        val result = problem.checkPerfectNumber(28)
        assertEquals(true, result)
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem0507()
        val result =  problem.checkPerfectNumber(7)
        assertEquals(false, result)
    }
}