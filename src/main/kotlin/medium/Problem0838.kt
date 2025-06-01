package medium

class Problem0838 {

    fun pushDominoes(dominoes: String): String {
        val ans = dominoes.toCharArray()
        var start = 0
        var goingRight = false

        for (index in 0..dominoes.length) {
            if (index == dominoes.length || dominoes[index] == 'R') {
                if (goingRight) {
                    var j = index - 1
                    while (start <= j) {
                        ans[start] = 'R'
                        ans[j] = 'R'
                        start++
                        j--
                    }
                }
                goingRight = true
                start = index + 1
            } else if (dominoes[index] == 'L') {
                if(!goingRight) {
                    var j = index - 1
                    while (start <= j) {
                        ans[start] = 'L'
                        ans[j] = 'L'
                        start++
                        j--
                    }
                } else {
                    var j = index - 1
                    while (start < j) {
                        ans[start] = 'R'
                        ans[j] = 'L'
                        start++
                        j--
                    }
                }
                goingRight = false
                start = index + 1
            }
        }

        return String(ans)
    }
}