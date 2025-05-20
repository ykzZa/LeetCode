package easy

class Problem2824 {

    fun countPairs(nums: List<Int>, target: Int): Int {

        var res = 0

        for (i in 0..<nums.size) {
            for (j in 0..<i) {
                if(nums[i] + nums[j] < target) {
                    res++
                }
            }
        }

        return res
    }
}