class Solution {
    private fun count1Bits(n: Int): Int {
        var count = 0
        var num = n
        while (num != 0) {
            count++
            num = num and (num - 1)
            // Clears the least significant bit set to 1
            // 110 = 6 (num)
            // and
            // 101 = 5 (num - 1)
            // =
            // 100 = 4
        }
        return count
    }

    fun countBits(n: Int): IntArray {
        return IntArray(n + 1) {
            count1Bits(it)
        }
    }
}