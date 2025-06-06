package easy

class Problem1512 {

    fun numIdenticalPairs(nums: IntArray): Int {
        var counter = 0

        for (i in nums.indices) {
            for (j in i + 1..<nums.size) {
                if (nums[i] == nums[j]) counter++
            }
        }

        return counter
    }
}