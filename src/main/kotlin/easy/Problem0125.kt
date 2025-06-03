package easy

class Problem0125 {

    fun isPalindrome(s: String): Boolean {
        var i = 0
        var j = s.length - 1
        while (i <= j) {
            while (i < j && !s[i].isLetterOrDigit()) {
                i++
            }
            while (j > i && !s[j].isLetterOrDigit()) {
                j--
            }
            if (s[i].lowercaseChar() != s[j].lowercaseChar()) {
                return false
            } else {
                i++
                j--
            }
        }
        return true
    }
}