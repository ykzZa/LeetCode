package easy

class Problem3498 {

    fun reverseDegree(s: String): Int {
        var reversedDegree = 0

        for(i in s.indices) {
            reversedDegree += (27 - (s[i] - 'a' + 1)) * (i + 1)
        }

        return reversedDegree
    }
}