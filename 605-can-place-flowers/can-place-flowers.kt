class Solution {
    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
        if (n == 0) return true
        var currentCount = 0
        val maxIndex = flowerbed.size - 1
        var i = 0
        while (i <= maxIndex) {
            val currentPot = flowerbed[i]

            if (currentPot == 1) {
                i += 2
                continue
            }
            val prevPot = if (i == 0) 0 else flowerbed[i - 1]
            val nextPot = if (i == maxIndex) 0 else flowerbed[i + 1]

            if (prevPot == 0 && nextPot == 0) {
                currentCount++
                i++

                if (currentCount == n) {
                    return true
                }
            }

            i++
        }

        return false
    }
}