package easy

class Problem0349 {

    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        val uniqueElements = hashSetOf<Int>()

        for (num in nums1) {
            uniqueElements.add(num)
        }

        val result = mutableListOf<Int>()

        for (num in nums2) {
            if (uniqueElements.contains(num)) {
                result.add(num)
                uniqueElements.remove(num)
            }
        }

        return result.toIntArray()
    }
}