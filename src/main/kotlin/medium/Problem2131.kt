package medium

class Problem2131 {

    fun longestPalindrome(words: Array<String>): Int {
        val countTable = hashMapOf<String, Int>()
        var haveDouble = false
        var sum = 0

        for (word in words) {
            countTable[word] = (countTable[word] ?: 0) + 1
        }

        for (key in countTable.keys) {
            if (key == key.reversed()) {
                if(!haveDouble) {
                    haveDouble = (countTable[key] ?: 0) % 2 == 1
                }
                sum += ((countTable[key] ?: 0) / 2) * 4
            } else {
                val min = minOf(
                    countTable[key] ?: 0,
                    countTable[key.reversed()] ?: 0
                )

                sum += min * 2
            }
        }

        if (haveDouble) {
            sum += 2
        }

        println(countTable)
        println(haveDouble)

        return sum
    }
}