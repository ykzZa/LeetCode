package easy

import org.testng.annotations.Test
import kotlin.test.assertEquals

class Problem1108Test {

    @Test
    fun testExampleOne() {
        val problem = Problem1108()
        val result = problem.defangIPaddr("1.1.1.1")
        assertEquals("1[.]1[.]1[.]1", result)
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem1108()
        val result = problem.defangIPaddr("255.100.50.0")
        assertEquals("255[.]100[.]50[.]0", result)
    }
}