package easy

class Problem0058 {

    fun lengthOfLastWord(s: String): Int {
        var counter = 0
        for (i in s.length - 1 downTo 0) {
            if (s[i] == ' ' && counter != 0) return counter
            if (s[i] != ' ') counter++
        }
        return counter
    }
}