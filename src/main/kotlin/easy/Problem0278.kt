package easy

class Problem0278(
    val isBadVersion: (Int) -> Boolean
) {

    fun firstBadVersion(n: Int): Int {
        var left = 1
        var right = n

        while (left < right) {
            val mid = left + (right - left) / 2

            if (isBadVersion(mid)) {
                right = mid
            } else {
                left = mid + 1
            }
        }

        return left
    }
}