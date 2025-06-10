package easy

class Problem2652 {

    fun sumOfMultiples(n: Int): Int {
        var res = 0
        for(i in 3..n) {
            if((i % 3 == 0) || (i % 5 == 0) || (i % 7 == 0)) {
                res += i
            }
        }
        return res
    }
}