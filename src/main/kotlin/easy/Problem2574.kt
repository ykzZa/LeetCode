package easy

import kotlin.math.abs

class Problem2574 {

    fun leftRightDifference(nums: IntArray): IntArray {

        val res = IntArray(nums.size)

        val leftSums = IntArray(nums.size) { 0 }
        for (i in 1..<nums.size) {
            leftSums[i] = leftSums[i - 1] + nums[i - 1]
        }

        val rightSums = IntArray(nums.size) { 0 }
        for (i in nums.size - 2 downTo 0) {
            rightSums[i] = rightSums[i + 1] + nums[i + 1]
        }

        for (i in nums.indices) {
            res[i] = abs(leftSums[i] - rightSums[i])
        }

        return res
    }
}