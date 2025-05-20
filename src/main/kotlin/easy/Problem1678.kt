package easy

class Problem1678 {

    fun interpret(command: String): String {

        val str = StringBuilder("")
        var i = 0

        while (i <= command.lastIndex) {
            when (command[i]) {
                'G' -> {
                    str.append('G')
                    i++
                }
                '(' -> {
                    if (command[i + 1] == ')') {
                        str.append('o')
                        i += 2
                    } else {
                        str.append("al")
                        i += 4
                    }
                }
            }
        }

        return str.toString()
    }
}