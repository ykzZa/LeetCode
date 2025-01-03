package easy

class Problem0013 {
    fun romanToInt(s: String): Int {

        var result = 0
        var prev = 0

        for (i in s.indices) {
            val intChar = charToInt(s[s.length - 1 - i])
            if (intChar >= prev) {
                result += intChar
            } else {
                result -= intChar
            }
            prev = intChar
        }

        return result
    }

    private fun charToInt(char: Char): Int {
        return when (char) {
            'I' -> 1
            'V' -> 5
            'X' -> 10
            'L' -> 50
            'C' -> 100
            'D' -> 500
            'M' -> 1000
            else -> 0
        }
    }
}