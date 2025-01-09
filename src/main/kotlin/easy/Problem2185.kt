package easy

class Problem2185 {

    fun prefixCount(words: Array<String>, pref: String): Int {
        var counter = 0
        for (i in words.indices) {
            if (words[i].length >= pref.length && words[i].substring(0, pref.length) == pref) counter++
        }
        return counter
    }
}