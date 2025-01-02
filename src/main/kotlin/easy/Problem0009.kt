package easy

class Problem0009 {

    fun isPalindrome(x: Int): Boolean {
        if (x < 0) return false
        val stringX = x.toString()
        for (c in 0..stringX.length / 2) {
            if (stringX[c] != stringX[stringX.length - c - 1]) return false
        }
        return true
    }
}