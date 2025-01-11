package easy

import kotlin.math.abs

class Problem3110 {

    fun scoreOfString(s: String): Int {
        var score = 0
        for (charIndex in 0..s.length - 2) {
            score += abs(s[charIndex] - s[charIndex + 1])
        }
        return score
    }
}