package easy

import org.testng.annotations.Test
import kotlin.test.assertEquals

class Problem2769Test {


    @Test
    fun testExampleOne() {
        val problem = Problem2769()
        val result = problem.theMaximumAchievableX(4, 1)
        assertEquals(6, result)
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem2769()
        val result = problem.theMaximumAchievableX(3, 2)
        assertEquals(7, result)
    }
}