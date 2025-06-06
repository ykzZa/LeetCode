package easy

class Problem1185 {

    fun dayOfTheWeek(day: Int, month: Int, year: Int): String {
        val leapYearsBefore = (year - 1) / 4 - 1971 / 4
        val days = (year - 1971) * 365 + leapYearsBefore + dayOfYear(year, month, day)
        return when (days % 7) {
            1 -> "Friday"
            2 -> "Saturday"
            3 -> "Sunday"
            4 -> "Monday"
            5 -> "Tuesday"
            6 -> "Wednesday"
            else -> "Thursday"
        }
    }

    private fun dayOfYear(year: Int, month: Int, day: Int): Int {

        val isLeapYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0
        var days = day

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