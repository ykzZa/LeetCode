package easy

class Problem0367 {

    fun isPerfectSquare(num: Int): Boolean {

        val longNum = num.toLong()
        var left: Long = 0
        var right: Long = longNum

        while (left <= right) {
            val mid = left + (right - left) / 2
            val midPow2: Long = mid * mid

            when {
                midPow2 == longNum -> {
                    return true
                }

                midPow2 < longNum -> {
                    left = mid + 1
                }

                midPow2 > longNum -> {
                    right = mid - 1
                }
            }
        }
        return false
    }
}