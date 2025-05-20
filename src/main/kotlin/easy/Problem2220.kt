package easy

class Problem2220 {

    fun minBitFlips(start: Int, goal: Int): Int {
        var res = start xor goal

        var bitsFlip = 0

        while (res > 0) {
           if(res % 2 == 1) {
               bitsFlip++
           }
            res /= 2
        }

        return bitsFlip
    }
}