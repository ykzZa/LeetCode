package easy

import org.testng.annotations.Test
import kotlin.test.assertContentEquals

class Problem2469Test {

    @Test
    fun testExampleOne() {
        val problem = Problem2469()
        val result = problem.convertTemperature(36.5)
        assertContentEquals(doubleArrayOf(309.65000,97.70000), result)
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem2469()
        val result = problem.convertTemperature(122.11)
        assertContentEquals(doubleArrayOf(395.26000,251.79800), result)
    }
}