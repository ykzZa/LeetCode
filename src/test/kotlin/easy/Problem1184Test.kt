package easy

import org.testng.annotations.Test
import kotlin.test.assertEquals

class Problem1184Test {

    @Test
    fun testExampleOne() {
        val problem = Problem1184()
        val result = problem.distanceBetweenBusStops(
            intArrayOf(1, 2, 3, 4),
            0,
            1
        )
        assertEquals(1, result)
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem1184()
        val result = problem.distanceBetweenBusStops(
            intArrayOf(1, 2, 3, 4),
            0,
            2
        )
        assertEquals(3, result)
    }

    @Test
    fun testExampleThree() {
        val problem = Problem1184()
        val result = problem.distanceBetweenBusStops(
            intArrayOf(1, 2, 3, 4),
            0,
            3
        )
        assertEquals(4, result)
    }

    @Test
    fun testExampleFour() {
        val problem = Problem1184()
        val result = problem.distanceBetweenBusStops(
            intArrayOf(7, 10, 1, 12, 11, 14, 5, 0),
            7,
            2
        )
        assertEquals(17, result)
    }
}