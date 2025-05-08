package easy

import org.testng.annotations.Test
import kotlin.test.assertEquals

class Problem2011Test {

    @Test
    fun testExampleOne() {
        val problem = Problem2011()
        val result = problem.finalValueAfterOperations(arrayOf("--X","X++","X++"))
        assertEquals(1, result)
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem2011()
        val result = problem.finalValueAfterOperations(arrayOf("++X","++X","X++"))
        assertEquals(3, result)
    }

    @Test
    fun testExampleThree() {
        val problem = Problem2011()
        val result = problem.finalValueAfterOperations(arrayOf("X++","++X","--X","X--"))
        assertEquals(0, result)
    }
}