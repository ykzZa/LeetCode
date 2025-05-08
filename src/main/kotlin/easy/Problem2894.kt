package easy

class Problem2894 {

    fun differenceOfSums(n: Int, m: Int): Int {
        var res = 0

        for (num in 1..n) {
            if (num % m == 0) {
                res -= num
            } else {
                res += num
            }
        }

        return res
    }
}