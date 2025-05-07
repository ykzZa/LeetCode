package easy

import org.testng.annotations.Test
import kotlin.test.assertEquals

class Problem3516Test {

    @Test
    fun testExampleOne() {
        val problem = Problem3516()
        val result = problem.findClosest(2, 7, 4)
        assertEquals(1, result)
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem3516()
        val result = problem.findClosest(2, 5, 6)
        assertEquals(2, result)
    }

    @Test
    fun testExampleThree() {
        val problem = Problem3516()
        val result = problem.findClosest(1, 5, 3)
        assertEquals(0, result)
    }
}