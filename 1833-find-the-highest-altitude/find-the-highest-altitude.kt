class Solution {
    fun largestAltitude(gain: IntArray): Int {
        var highest = 0
        var curr = 0

        for (altitude in gain) {
            curr += altitude
            highest = maxOf(highest, curr)
        }

        return highest
    }
}