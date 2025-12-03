class Solution {
    fun findMaxAverage(nums: IntArray, k: Int): Double {
        
        if (nums.size == k) {
            return (nums.sum() / k.toDouble())
        }
        
        var currentTotal = 0

        // Initial value
        for (i in 0 until k) {
            currentTotal += nums[i]
        }

        var maxTotal = currentTotal
        for (i in k until nums.size) {
            currentTotal = currentTotal + nums[i] - nums[i - k]
            if (currentTotal > maxTotal) {
                maxTotal = currentTotal
            }
        }


        return maxTotal / k.toDouble()
    }
}