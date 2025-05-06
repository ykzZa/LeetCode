package easy

class Problem1920 {

    fun buildArray(nums: IntArray): IntArray {
        val result = IntArray(nums.size)

        for(i in nums.indices) {
            result[i] = nums[nums[i]]
        }

        return result
    }
}