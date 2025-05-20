package easy

class Problem1431 {

    fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
        val res = mutableListOf<Boolean>()

        var max = candies[0]
        for (num in candies) {
            if (num > max) max = num
        }

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