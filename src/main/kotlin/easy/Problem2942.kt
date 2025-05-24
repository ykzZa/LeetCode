package easy

class Problem2942 {

    fun findWordsContaining(words: Array<String>, x: Char): List<Int> {
        val ans = mutableListOf<Int>()

        for (i in words.indices) {
            for (char in words[i]) {
                if(char == x) {
                    ans.add(i)
                    break
                }
            }
        }

        return ans
    }
}