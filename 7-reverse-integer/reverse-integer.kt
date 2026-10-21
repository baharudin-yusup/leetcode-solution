class Solution {
    fun reverse(x: Int): Int {
        if (x < -2147483648 || x > 2147483647) {
            return 0
        }
        // 120 = 1x100 + 2x10 + 0x1
        // --> 120 % 10 = 0, 120/10 = 12
        // --> 12 % 10 = 2, 12/10 = 1
        // --> 1 % 10 = 1, 10/10 = 0

        // 0 -> 0x1 (A value) = 0
        // 02 -> 0x10 (A value * 10 => B) + 2x1 (C value) = 2
        // 021 -> 10x100 (B value * 10) + 2x10 (C value * 10) + 1x1 (D value) = 21

        val isNegative = x < 0
        var currentX = if (isNegative) x * -1 else x
        var totalValue = 0L
        while (currentX > 0) {
            totalValue = totalValue * 10 + currentX % 10
            currentX /= 10
        }

        if (totalValue > Int.MAX_VALUE) {
            return 0
        }

        return (if (isNegative) totalValue * -1 else totalValue).toInt()
    }
}