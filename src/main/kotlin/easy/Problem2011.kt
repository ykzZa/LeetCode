package easy

class Problem2011 {

    fun finalValueAfterOperations(operations: Array<String>): Int {
        var res = 0
        for (operation in operations) {
            res += if (operation[1] == '+') {
                1
            } else {
                -1
            }
        }
        return res
    }
}