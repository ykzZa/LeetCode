package easy

class Problem0027 {

    fun removeElement(nums: IntArray, `val`: Int): Int {
        var counter = 0
        var n = nums.size
        while (counter < n) {
            if (nums[counter] == `val`) {
                nums[counter] = nums[n - 1]
                n -= 1
            } else {
                counter += 1
            }
        }
        return n
    }
}