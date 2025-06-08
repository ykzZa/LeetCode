package easy

class Problem0500 {

    fun findWords(words: Array<String>): Array<String> {
        val rows = arrayOf(
            "qwertyuiopQWERTYUIOP",
            "asdfghjklASDFGHJKL",
            "zxcvbnmZXCVBNM"
        )
        val res = mutableListOf<String>()
        for (word in words) {
            val rowIndex = rows.indexOfFirst { it.contains(word[0]) }
            var length = 0
            for (char in word) {
                if (!rows[rowIndex].contains(char)) {
                    break
                }
                length++
            }
            if (word.length == length) {
                res.add(word)
            }
        }
        return res.toTypedArray()
    }
}