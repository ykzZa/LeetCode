package easy

class Problem3280 {

    fun convertDateToBinary(date: String): String {
        val numbers = date.split('-')
        val binaryDate = StringBuilder("")

        binaryDate.append(numbers[0].toInt().toString(2))
        binaryDate.append("-")
        binaryDate.append(numbers[1].toInt().toString(2))
        binaryDate.append("-")
        binaryDate.append(numbers[2].toInt().toString(2))

        return binaryDate.toString()
    }
}