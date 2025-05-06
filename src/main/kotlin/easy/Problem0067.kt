package easy

class Problem0067 {

    fun addBinary(a: String, b: String): String {
        val answer = StringBuilder("")

        var counter = 0

        var aIndex = a.length - 1
        var bIndex = b.length - 1

        while (aIndex >= 0 || bIndex >= 0 || counter > 0) {
            if (aIndex >= 0) {
                counter += a[aIndex] - '0'
            }
            if (bIndex >= 0) {
                counter += b[bIndex] - '0'
            }
            answer.insert(0, counter % 2)
            counter /= 2
            aIndex -= 1
            bIndex -= 1
        }
        return answer.toString()
    }
}