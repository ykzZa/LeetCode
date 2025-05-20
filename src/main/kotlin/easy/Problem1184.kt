package easy

class Problem1184 {

    fun distanceBetweenBusStops(distance: IntArray, start: Int, destination: Int): Int {
        var path1 = 0
        var path2 = 0
        for (i in distance.indices) {
            if (i in minOf(start, destination)..<maxOf(start, destination)) {
                path1 += distance[i]
            } else {
                path2 += distance[i]
            }
        }
        return if (path1 < path2) path1 else path2
    }
}