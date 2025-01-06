package easy

class Problem2469 {

    fun convertTemperature(celsius: Double): DoubleArray {
        val ans = doubleArrayOf(celsius + 273.15, celsius * 1.80 + 32.00)
        return ans
    }
}