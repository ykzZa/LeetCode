package easy

class Problem0014 {

    fun longestCommonPrefix(strs: Array<String>): String {

        if (strs.size == 1) return strs[0]

        var prefix = ""
        var prevPrefix = ""

        for (prefixIndex in 1..strs[0].length) {

            prefix = strs[0].take(prefixIndex)

            for (otherWordIndex in 1..<strs.size) {

                if (!strs[otherWordIndex].startsWith(prefix)) return prevPrefix
            }

            prevPrefix = prefix
        }

        return prefix
    }
}