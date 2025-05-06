package easy

import org.testng.annotations.Test
import kotlin.test.assertEquals

class Problem0067Test {

    @Test
    fun testExampleOne() {
        val problem = Problem0067()
        val result = problem.addBinary("11", "1")
        assertEquals("100", result)
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem0067()
        val result = problem.addBinary("1010", "1011")
        assertEquals("10101", result)
    }

    @Test
    fun testExampleThree() {
        val problem = Problem0067()
        val result = problem.addBinary("1111", "1111")
        assertEquals("11110", result)
    }

    @Test
    fun testExampleFour() {
        val problem = Problem0067()
        val result = problem.addBinary("100", "110010")
        assertEquals("110110", result)
    }
}