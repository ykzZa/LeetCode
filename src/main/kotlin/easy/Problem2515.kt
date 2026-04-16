package easy

class Problem2515 {

    fun closestTarget(words: Array<String>, target: String, startIndex: Int): Int {
        var i = 0
        while (i <= words.size / 2) {
            val left = (startIndex - i).mod(words.size)
            val right = (startIndex + i) % words.size
            if (words[left] == target || words[right] == target) return i
            i++
        }
        return -1
    }
}