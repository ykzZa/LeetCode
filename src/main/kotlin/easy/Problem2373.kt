package easy

class Problem2373 {

    fun largestLocal(grid: Array<IntArray>): Array<IntArray> {

        val resArr = Array(grid.size - 2) { IntArray(grid.size - 2) }

        for (i in 0..grid.size - 3) {

            for (j in 0..grid.size - 3) {

                var max = 0

                for (k in i..i + 2) {

                    for (numI in j..j + 2) {

                        if (grid[k][numI] > max) {
                            max = grid[k][numI]
                        }
                    }
                }

                resArr[i][j] = max
            }
        }

        return resArr
    }
}