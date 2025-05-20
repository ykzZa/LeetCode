package easy

class Problem2798 {

    fun numberOfEmployeesWhoMetTarget(hours: IntArray, target: Int): Int {
        var res = 0

        for (employee in hours) {
            if (employee >= target) {
                res++
            }
        }

        return res
    }
}