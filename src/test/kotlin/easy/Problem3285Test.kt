package easy

import org.testng.annotations.Test
import kotlin.test.assertContentEquals

class Problem3285Test {

    @Test
    fun testExampleOne() {
        val problem = Problem3285()
        val result = problem.stableMountains(intArrayOf(1, 2, 3, 4, 5), 2)
        assertContentEquals(listOf(3, 4), result)
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem3285()
        val result = problem.stableMountains(intArrayOf(10, 1, 10, 1, 10), 3)
        assertContentEquals(listOf(1, 3), result)
    }

    @Test
    fun testExampleThree() {
        val problem = Problem3285()
        val result = problem.stableMountains(intArrayOf(10, 1, 10, 1, 10), 10)
        assertContentEquals(listOf(), result)
    }
}