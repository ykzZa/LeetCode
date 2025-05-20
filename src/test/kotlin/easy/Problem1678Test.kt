package easy

import org.testng.annotations.Test
import kotlin.test.assertEquals

class Problem1678Test {


    @Test
    fun testExampleOne() {
        val problem = Problem1678()
        val result = problem.interpret("G()(al)")
        assertEquals("Goal", result)
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem1678()
        val result = problem.interpret("G()()()()(al)")
        assertEquals("Gooooal", result)
    }

    @Test
    fun testExampleThree() {
        val problem = Problem1678()
        val result = problem.interpret("(al)G(al)()()G")
        assertEquals("alGalooG", result)
    }
}