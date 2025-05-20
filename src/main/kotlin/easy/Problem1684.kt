package easy

class Problem1684 {

    fun countConsistentStrings(allowed: String, words: Array<String>): Int {
        var sum = 0
        for (word in words) {
            for (chIndex in word.indices) {
                if (!allowed.contains(word[chIndex])) {
                    break
                } else {
                    if(chIndex == word.lastIndex) {
                        sum++
                    }
                }
            }
        }
        return sum
    }
}