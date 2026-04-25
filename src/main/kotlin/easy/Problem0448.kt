package easy

class Problem0448 {

    fun findDisappearedNumbers(nums: IntArray): List<Int> {
        val arr = IntArray(nums.size) { 0 }

        for (i in nums) {
            arr[i - 1]++
        }

        val result = mutableListOf<Int>()

        for (i in arr.indices) {
            if(arr[i] == 0) {
                result.add(i + 1)
            }
        }

        return result
    }
}