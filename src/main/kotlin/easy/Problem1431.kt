package easy

class Problem1431 {

    fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
        val res = mutableListOf<Boolean>()
        val max = candies.max()

        for (c in candies) {
            if (c + extraCandies >= max) {
                res.add(true)
            } else {
                res.add(false)
            }
        }

        return res
    }
}