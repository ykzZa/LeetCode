package easy

import java.util.HashSet

class Problem3718 {

    fun missingMultiple(nums: IntArray, k: Int): Int {
        val hashSet = HashSet<Int>()
        for(i in nums) {
            hashSet.add(i)
        }
        var multiple = k
        while(hashSet.contains(multiple)) {
            multiple += k
        }
        return multiple
    }
}