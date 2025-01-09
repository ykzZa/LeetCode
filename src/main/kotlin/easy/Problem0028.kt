package easy

class Problem0028 {

    fun strStr(haystack: String, needle: String): Int {
        var counter = 0

        while (counter + needle.length <= haystack.length) {
            for (i in needle.indices) {
                if (haystack[counter + i] != needle[i]) break
                if ((i == needle.length - 1) && (haystack[counter + i] == needle[i])) return counter
            }
            counter++
        }

        return -1
    }
}