package easy

class Problem2413 {

    fun smallestEvenMultiple(n: Int): Int {
        return if (n % 2 == 0) {
            n
        } else {
            n * 2
        }
    }
}