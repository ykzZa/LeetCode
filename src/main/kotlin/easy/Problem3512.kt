package easy

class Problem3512 {

    fun minOperations(nums: IntArray, k: Int): Int {
        var sum = 0

        for (num in nums)  {
            sum += num
        }

        return sum % k
    }
}