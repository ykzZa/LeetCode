package medium

class Problem0036 {

    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val squares = Array(9) { HashSet<Char>() }
        val columns = Array(9) { HashSet<Char>() }
        val rows = Array(9) { HashSet<Char>() }

        for (rowIndex in 0..8) {
            for (numIndex in 0..8) {
                if (board[rowIndex][numIndex] != '.') {
                    if (!rows[rowIndex].add(board[rowIndex][numIndex])) return false
                    if (!columns[numIndex].add(board[rowIndex][numIndex])) return false
                    if (!squares[(rowIndex / 3) * 3 + numIndex / 3].add(board[rowIndex][numIndex])) return false
                }
            }
        }

        return true
    }
}