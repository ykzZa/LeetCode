package easy

class Problem1365 {

    fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
        val res = IntArray(nums.size) { 0 }
        for ((index, num) in nums.withIndex()) {
            for (compared in nums) {
                if (compared < num) {
                    res[index]++
                }
            }
        }
        return res
    }
}