package easy

class Problem0242 {

    fun isAnagram(s: String, t: String): Boolean {
        val sHash = HashMap<Char, Int>()
        val tHash = HashMap<Char, Int>()

        for (char in s) {
            sHash[char] = (sHash[char] ?: 0) + 1
        }

        for (char in t) {
            tHash[char] = (tHash[char] ?: 0) + 1
        }

        return sHash == tHash
    }
}