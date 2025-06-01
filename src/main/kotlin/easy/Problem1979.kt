package easy

class Problem1979 {

    fun findGCD(nums: IntArray): Int {
        var min = nums[0]
        var max = nums[0]

        for (num in nums) {
            if (num < min) {
                min = num
            }
            if (num > max) {
                max = num
            }
        }

        var i = min
        while (max % i != 0 || min % i != 0) {
            i--
        }

        return i
    }
}