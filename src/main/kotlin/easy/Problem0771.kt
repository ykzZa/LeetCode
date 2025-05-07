package easy

class Problem0771 {

    fun numJewelsInStones(jewels: String, stones: String): Int {
        var count = 0

        for (jewel in jewels) {
            count += stones.count { it == jewel }
        }

        return count
    }
}