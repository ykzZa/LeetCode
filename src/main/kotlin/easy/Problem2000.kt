package easy

class Problem2000 {

    fun reversePrefix(word: String, ch: Char): String {
        val prefixIndex = word.indexOf(ch)

        if(prefixIndex == -1) return word

        val ans = word.toCharArray()

        for (i in 0..prefixIndex / 2) {
            val temp = ans[i]
            ans[i] = ans[prefixIndex - i]
            ans[prefixIndex - i] = temp
        }

        return ans.concatToString()
    }
}