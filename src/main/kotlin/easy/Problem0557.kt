package easy

class Problem0557 {

    fun reverseWords(s: String): String {

        val words = s.split(" ")

        val ans = StringBuilder("")

        for (word in words) {
            ans.append(word.reversed())
            ans.append(" ")
        }

        return ans.toString().dropLast(1)
    }
}