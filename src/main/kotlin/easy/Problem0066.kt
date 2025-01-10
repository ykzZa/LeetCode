package easy

class Problem0066 {

    fun plusOne(digits: IntArray): IntArray {
        for (i in digits.size - 1 downTo 0) {
            if (digits[i] == 9) {
                digits[i] = 0
            } else {
                digits[i]++
                return digits
            }
        }
        return IntArray(digits.size + 1).apply {
            this[0] = 1
        }
    }
}