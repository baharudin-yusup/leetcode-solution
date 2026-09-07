class Solution {
    fun longestSubarray(nums: IntArray): Int {
        var prevPath = 0
        var currPath = 0
        var max = 0
        
        for (i in 0 until nums.size) {
            if (nums[i] == 1) {
                currPath++
            } else {
                max = maxOf(max, prevPath + currPath)
                prevPath = currPath
                currPath = 0
            }
        }

        // Handle when last index is not `0`
        max = maxOf(max, prevPath + currPath)

        // if `max == nums.size` then it's mean all the array item is `1` 
        return if (max == nums.size) max - 1 else max
    }
}