package easy

class Problem0088 {

    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        var num1Index = m - 1
        var num2Index = n - 1
        var iterator = m + n - 1
        while (num2Index >= 0) {
            if(num1Index < 0 || nums2[num2Index] > nums1[num1Index]) {
                nums1[iterator--] = nums2[num2Index--]
            } else {
                nums1[iterator--] = nums1[num1Index--]
            }
        }
    }
}
