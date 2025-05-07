package easy

import kotlin.math.abs

class Problem3516 {

    fun findClosest(x: Int, y: Int, z: Int): Int {
        if((abs(z - x)) == abs(z- y)) return 0
        if((abs(z - x)) < abs(z- y)) return 1
        return 2
    }
}