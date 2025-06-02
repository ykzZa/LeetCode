package medium

import org.testng.annotations.Test
import kotlin.test.assertContentEquals

class Problem0049Test {

    @Test
    fun testExampleOne() {
        val problem = Problem0049()
        val result = problem.groupAnagrams(arrayOf("eat", "tea", "tan", "ate", "nat", "bat"))
        assertContentEquals(
            listOf(
                listOf("bat"),
                listOf("nat", "tan").sorted(),
                listOf("ate", "eat", "tea").sorted()
            ).sortedBy { it.size },
            result.map {
                it.sorted()
            }.sortedBy { it.size }
        )
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem0049()
        val result = problem.groupAnagrams(arrayOf(""))
        assertContentEquals(
            listOf(
                listOf("")
            ).sortedBy { it.size },
            result.sortedBy { it.size }
        )
    }

    @Test
    fun testExampleThree() {
        val problem = Problem0049()
        val result = problem.groupAnagrams(arrayOf("a"))
        assertContentEquals(
            listOf(
                listOf("a")
            ).sortedBy { it.size },
            result.sortedBy { it.size }
        )
    }
}