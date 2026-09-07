class Solution {
    fun longestSubarray(nums: IntArray): Int {
        var l = -1
        var totalZero = 0
        var alreadyTrimmed = false
        var max = 0
        var curr = 0
        
        for (i in 0 until nums.size) {
            if (nums[i] > 0) {
                curr++
            } else {
                totalZero++
                alreadyTrimmed = true
            }

            while (totalZero > 1 && l < nums.size) {
                l++
                if (nums[l] == 0) {
                    totalZero--
                } else {
                    curr--
                }
            }

            max = maxOf(curr, max)
        }

        return if (alreadyTrimmed) max else max - 1
    }
}