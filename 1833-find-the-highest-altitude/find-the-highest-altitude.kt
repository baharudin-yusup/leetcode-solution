class Solution {
    fun largestAltitude(gain: IntArray): Int {
        var currentAltitude = 0
        var highestAltitude = 0

        for (g in gain) {
            currentAltitude += g
            highestAltitude = max(highestAltitude, currentAltitude)
        }

        return highestAltitude
    }
}