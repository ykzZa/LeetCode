package easy

import org.testng.annotations.Test
import kotlin.test.assertEquals

class Problem0771Test {

    @Test
    fun testExampleOne() {
        val problem = Problem0771()
        val result = problem.numJewelsInStones("aA", "aAAbbbb")
        assertEquals(3, result)
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem0771()
        val result = problem.numJewelsInStones("z", "ZZ")
        assertEquals(0, result)
    }
}