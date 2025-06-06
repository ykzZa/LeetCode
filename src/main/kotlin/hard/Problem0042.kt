package hard

class Problem0042 {

    fun trap(height: IntArray): Int {
        val leftMax = IntArray(height.size)
        val rightMax = IntArray(height.size)

        var lMax = 0
        var rMax = 0

        for (i in height.indices) {
            leftMax[i] = lMax
            if (height[i] > lMax) lMax = height[i]

            rightMax[height.size - i - 1] = rMax
            if (height[height.size - i - 1] > rMax) rMax = height[height.size - i - 1]
        }

        var sum = 0

        for (i in height.indices) {
            val wHeight = minOf(leftMax[i], rightMax[i]) - height[i]
            if (wHeight > 0) sum += wHeight
        }

        return sum
    }
}