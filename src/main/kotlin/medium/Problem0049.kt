package medium

class Problem0049 {

    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val hashMap = HashMap<List<Int>, List<String>>()

        for (str in strs) {
            val arr = MutableList(26) { 0 }

            for (char in str) {
                arr[char - 'a'] += 1
            }
            hashMap[arr] = (hashMap[arr] ?: emptyList()) + str
        }

        return hashMap.values.toList()
    }
}