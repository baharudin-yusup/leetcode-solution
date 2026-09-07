class Solution {
    // fun longestSubarray(nums: IntArray): Int {
    //     var l = -1
    //     var totalZero = 0
    //     var max = 0
    //     var curr = 0
        
    //     for (i in 0 until nums.size) {
    //         if (nums[i] > 0) {
    //             curr++
    //         } else {
    //             totalZero++
    //         }

    //         while (totalZero > 1 && l < nums.size) {
    //             l++
    //             if (nums[l] == 0) {
    //                 totalZero--
    //             } else {
    //                 curr--
    //             }
    //         }

    //         max = maxOf(curr, max)
    //     }

    //     return if (max == nums.size) max - 1 else max
    // }

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

        return if (max == nums.size) max - 1 else max
    }
}