package easy

class Problem1929 {

    fun getConcatenation(nums: IntArray): IntArray {
        val result = IntArray(nums.size * 2)
        for (i in nums.indices) {
            val num = nums[i]
            result[i] = num
            result[i + nums.size] = num
        }
        return result
    }
}