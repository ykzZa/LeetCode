package easy

class Problem3668 {

    fun recoverOrder(order: IntArray, friends: IntArray): IntArray {
        val hs = HashSet<Int>()
        for(f in friends) {
            hs.add(f)
        }
        val result = IntArray(friends.size)
        var j = 0
        for(i in order) {
            if(hs.contains(i)) {
                result[j] = i
                j++
            }
        }
        return result
    }
}