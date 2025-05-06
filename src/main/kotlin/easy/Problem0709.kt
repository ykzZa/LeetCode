package easy

class Problem0709 {

    fun toLowerCase(s: String): String {
        return s.lowercase()
    }

    fun toLowerCaseNoLib(s: String): String {
        val ans = StringBuilder("")
        for (char in s) {
            if (char in 'A'..'Z') {
                ans.append(char + 32)
            } else {
                ans.append(char)
            }
        }
        return ans.toString()
    }
}