package easy

import kotlin.math.abs

class Problem1544 {

    fun makeGood(s: String): String {
        val goodString = StringBuilder()

        for (char in s) {
            if (goodString.isEmpty()) {
                goodString.append(char)
            } else {
                val isLowUp = abs(char - goodString.get(goodString.length - 1)) == 32
                if (isLowUp) {
                    goodString.deleteCharAt(goodString.length - 1)
                } else {
                    goodString.append(char)
                }
            }
        }

        return goodString.toString()
    }
}