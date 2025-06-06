package medium

class Problem0238 {

    fun productExceptSelf(nums: IntArray): IntArray {

        val ans = IntArray(nums.size) { 1 }
        var pref = nums[0]
        var suf = nums[nums.size - 1]

        var i = 1
        var j = nums.size - 2
        while (j >= 0 && i <= nums.size - 1) {
            ans[i] *= pref
            ans[j] *= suf

            pref *= nums[i]
            suf *= nums[j]

            i++
            j--
        }

        return ans
    }
}