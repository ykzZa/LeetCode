package easy

class Problem0268 {

    fun missingNumber(nums: IntArray): Int {
        val calcSum = (nums.size * (nums.size + 1)) / 2
        var realSum = 0
        for(num in nums) {
            realSum += num
        }
        return calcSum - realSum
    }
}