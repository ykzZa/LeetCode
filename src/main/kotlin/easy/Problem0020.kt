package easy

import java.util.*

class Problem0020 {

    fun isValid(s: String): Boolean {
        val stack = Stack<Char>()
        for (char in s) {
            when (char) {
                '(', '[', '{' -> {
                    stack.push(char)
                }

                ')', ']', '}' -> {
                    if (stack.isEmpty()) return false
                    if (char == ')' && stack.peek() == '(') stack.pop() else
                    if (char == ']' && stack.peek() == '[') stack.pop() else
                    if (char == '}' && stack.peek() == '{') stack.pop() else return false

                }
            }
        }
        return stack.isEmpty()
    }
}