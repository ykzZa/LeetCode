package easy

class Problem0001 {

    fun twoSum(nums: IntArray, target: Int): IntArray {

        val map = hashMapOf<Int, Int>()

        nums.forEachIndexed { index, i ->
            map[target - i]?.let {
                return intArrayOf(it, index)
            }
            map[i] = index
        }

        return intArrayOf(0, 0)
    }
}