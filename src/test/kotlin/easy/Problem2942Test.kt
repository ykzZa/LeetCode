package easy

import org.testng.annotations.Test
import kotlin.test.assertContentEquals

class Problem2942Test {

    @Test
    fun testExampleOne() {
        val problem = Problem2942()
        val result = problem.findWordsContaining(arrayOf("leet", "code"), 'e')
        assertContentEquals(listOf(0, 1), result)
    }

    @Test
    fun testExampleTwo() {
        val problem = Problem2942()
        val result = problem.findWordsContaining(arrayOf("abc", "bcd", "aaaa", "cbc"), 'a')
        assertContentEquals(listOf(0, 2), result)
    }

    @Test
    fun testExampleThree() {
        val problem = Problem2942()
        val result = problem.findWordsContaining(arrayOf("abc", "bcd", "aaaa", "cbc"), 'z')
        assertContentEquals(listOf(), result)
    }
}