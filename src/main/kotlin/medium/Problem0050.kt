package medium

import kotlin.math.abs

class Problem0050 {

    fun myPow(x: Double, n: Int): Double {
        val pow = pow(x, abs(n))
        return if (n > 0) {
            pow
        } else {
            1 / pow
        }
    }

    private fun pow(x: Double, n: Int): Double {
        if (x == 0.0) return x
        if (n == 0) return 1.0
        return if (n % 2 == 0) {
            pow(x * x, n / 2)
        } else {
            pow(x * x, n / 2) * x
        }
    }
}