class Solution {
    fun longestOnes(nums: IntArray, k: Int): Int {
        var l = -1
        var best = -1
        var curr = 0
        var totalZeros = 0
        for (r in 0 until nums.size) {
            if (nums[r] == 1) {
                curr++
            } else {
                totalZeros++
                curr++
            }

            while (totalZeros > k) {
                l++
                if (nums[l] == 0) {
                    totalZeros--
                }
                curr--
            }

            // k = 1
            //   0    1    0    1    1
            // [-0-]  1    0    1    1   --> 1
            // [-0----1-]  0    1    1   --> 2
            //   0  [-1----0-]  1    1   --> 2
            //   0  [-1----0----1-]  1   --> 3
            //   0  [-1----0----1----1-] --> 4

            best = maxOf(curr, best)
        }

        return best
    }
}