package easy

class Problem1154 {

    fun dayOfYear(date: String): Int {

        val month = date.substring(5, 7).toInt()
        val year = date.substring(0, 4).toInt()
        val isLeapYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0
        var days = date[date.lastIndex].code - 48 + (date[date.lastIndex - 1].code - 48) * 10

        when (month) {
            1 -> days += 0
            2 -> days += 31
            3 -> days += 59
            4 -> days += 90
            5 -> days += 120
            6 -> days += 151
            7 -> days += 181
            8 -> days += 212
            9 -> days += 243
            10 -> days += 273
            11 -> days += 304
            12 -> days += 334
        }
        if (isLeapYear && month > 2) {
            days++
        }

        return days
    }
}