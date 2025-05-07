package easy

class Problem3467 {

    fun transformArray(nums: IntArray): IntArray {
        var evenCount = nums.count { it % 2 == 0 }
        val ans = IntArray(nums.size) {
            if (evenCount != 0) {
                evenCount -= 1
                0
            } else {
                1
            }
        }
        return ans
    }
}