package easy

class Problem3340 {

    fun isBalanced(num: String): Boolean {
        var sum = 0
        for (char in num.indices) {
            sum += if (char % 2 == 0) num[char].digitToInt() else -num[char].digitToInt()
        }
        return sum == 0
    }
}