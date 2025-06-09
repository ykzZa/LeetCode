package easy

class Problem3285 {

    fun stableMountains(height: IntArray, threshold: Int): List<Int> {
        val res = mutableListOf<Int>()

        for (i in 1..<height.size) {
            if (height[i - 1] > threshold) res.add(i)
        }

        return res
    }
}