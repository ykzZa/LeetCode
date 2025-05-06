package easy

class Problem3190 {

    fun minimumOperations(nums: IntArray): Int {
        var steps = 0
        for (num in nums) {
            if (num % 3 != 0) steps += 1
        }
        return steps
    }
}