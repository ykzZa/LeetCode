package medium

import org.testng.annotations.Test
import kotlin.test.assertEquals

class Problem0838Test {

    @Test
    fun testExampleOne() {
        val problem = Problem0838()
        val result = problem.pushDominoes("RR.L")
        assertEquals("RR.L", result)
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem0838()
        val result = problem.pushDominoes(".L.R...LR..L..")
        assertEquals("LL.RR.LLRRLL..", result)
    }
}