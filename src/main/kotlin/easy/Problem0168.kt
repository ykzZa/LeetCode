package easy

class Problem0168 {

    fun convertToTitle(columnNumber: Int): String {
        var n = columnNumber
        val str = StringBuilder("")
        while (n != 0) {
            n--
            str.insert(0, 'A' + (n % 26))
            n /= 26
        }
        return str.toString()
    }
}