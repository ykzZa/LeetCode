package easy

class Problem0069 {

    fun mySqrt(x: Int): Int {
        var left = 0
        var right = x

        while (left <= right) {

            val mid = left + (right - left) / 2

            when {
                mid * mid == x -> return mid

                mid * mid.toLong() < x -> left = mid + 1
                else -> right = mid - 1
            }
        }

        return right
    }
}