package easy

class Problem1351 {

    fun countNegatives(grid: Array<IntArray>): Int {
        var count = 0
        for(array in grid) {
            count += array.size - findFirstNegative(array)
        }
        return count
    }

    private fun findFirstNegative(row: IntArray): Int {
        var left = 0
        var right = row.size - 1

        while (left <= right) {
            val mid = left + (right - left) / 2

            when {
                row[mid] >= 0 -> {
                    left = mid + 1
                }
                else -> {
                    right = mid - 1
                }
            }
        }
        return left
    }
}