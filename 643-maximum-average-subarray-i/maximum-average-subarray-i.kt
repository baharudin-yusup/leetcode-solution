class Solution {
    fun findMaxAverage(nums: IntArray, k: Int): Double {
        var total = 0
        
        // Initial value
        for (i in 0 until k) {
            total += nums[i]
        }

        var current = total
        for (i in k until nums.size) {
            current += nums[i] - nums[i - k]
            total = maxOf(current, total)
        }

        return total / k.toDouble()
    }
}