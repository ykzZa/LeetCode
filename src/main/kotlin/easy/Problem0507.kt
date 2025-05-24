package easy

import kotlin.math.sqrt

class Problem0507 {

    fun checkPerfectNumber(num: Int): Boolean {

        if(num == 1) return false

        var sum = 0

        for (i in 1..sqrt(num.toDouble()).toInt()) {
            if (num % i == 0) {
                sum += i
                if (i != num / i && i != 1) {
                    sum += num / i
                }
                if (sum > num) {
                    return false
                }
            }
        }

        return sum == num
    }
}