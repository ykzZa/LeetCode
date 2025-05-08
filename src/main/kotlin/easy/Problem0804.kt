package easy

class Problem0804 {

    private val morse = arrayOf(
        ".-",
        "-...",
        "-.-.",
        "-..",
        ".",
        "..-.",
        "--.",
        "....",
        "..",
        ".---",
        "-.-",
        ".-..",
        "--",
        "-.",
        "---",
        ".--.",
        "--.-",
        ".-.",
        "...",
        "-",
        "..-",
        "...-",
        ".--",
        "-..-",
        "-.--",
        "--.."
    )

    fun uniqueMorseRepresentations(words: Array<String>): Int {

        val ans = hashSetOf<String>()

        for (word in words) {
            val morseWord = StringBuilder("")
            for (char in word) {
                morseWord.append(morse[char - 'a'])
            }
            ans.add(morseWord.toString())
        }

        return ans.size
    }
}