package medium


class Problem0347 {

    fun topKFrequent(nums: IntArray, k: Int): IntArray {

        val numFrequency = HashMap<Int, Int>()
        val frequencies = Array(nums.size + 1) { mutableListOf<Int>() }

        for (num in nums) {
            numFrequency[num] = 1 + numFrequency.getOrDefault(num, 0)
        }

        for(numFreq in numFrequency) {
            frequencies[numFreq.value].add(numFreq.key)
        }

        val res = IntArray(k)
        var j = 0

        for (i in frequencies.size - 1 downTo 1) {
            for (num in frequencies[i]) {
                res[j] = num
                j++
                if (j == k) {
                    return res
                }
            }
        }

        return res
    }
}