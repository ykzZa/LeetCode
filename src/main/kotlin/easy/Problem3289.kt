package easy

class Problem3289 {

    fun getSneakyNumbers(nums: IntArray): IntArray {
        val res = IntArray(2)
        var index = 0

        for (i in nums.indices) {
            for (j in i + 1..<nums.size) {
                if (nums[i] == nums[j]) {
                    res[index] = nums[i]
                    index++
                }
            }
        }

        return res
    }
}