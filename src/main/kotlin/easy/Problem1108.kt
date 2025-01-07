package easy

class Problem1108 {

    fun defangIPaddr(address: String): String {
        var s = ""
        for (i in address) {
            if (i == '.') s += "[.]" else s += i
        }
        return s
    }
}