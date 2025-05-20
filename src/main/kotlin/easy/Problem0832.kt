package easy

class Problem0832 {

    fun flipAndInvertImage(image: Array<IntArray>): Array<IntArray> {

        val res = Array(image.size) {
            IntArray(image.size)
        }

        for (rowIndex in image.indices) {
            for (cellIndex in image[rowIndex].indices) {
                if (image[rowIndex][cellIndex] == 1) {
                    res[rowIndex][image.size - cellIndex - 1] = 0
                } else {
                    res[rowIndex][image.size - cellIndex - 1] = 1
                }
            }
        }

        return res
    }
}