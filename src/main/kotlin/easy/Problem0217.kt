package easy

class Problem0217 {

    fun containsDuplicate(nums: IntArray): Boolean {
        val set = HashSet<Int>()
        for (num in nums) {
            if(!set.add(num)) {
                return true
            }
        }
        return false
    }
}