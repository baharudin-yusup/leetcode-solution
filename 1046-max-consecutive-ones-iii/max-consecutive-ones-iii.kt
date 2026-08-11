class Solution {
    fun longestOnes(nums: IntArray, k: Int): Int {
        var l = -1
        var best = -1
        var curr = 0
        var totalZeros = 0
        for (r in 0 ..< nums.size) {
            if (nums[r] == 1) {
                curr++
            } else {
                totalZeros++
                curr++
            }

            // println("r: ${r} | totalZeros: ${totalZeros} | curr: ${curr}")

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

            if (curr > best) {
                // var forL = l + 1
                // println("best:\t(l: ${l})\t\t${nums.slice(forL..r).joinToString(",")} | curr: ${curr}")
                best = curr
            }
            // else {
            //     // var forL = l + 1
            //     // println("\t\t(l: ${l})\t\t${nums.slice(forL..r).joinToString(",")} | curr: ${curr}")
            // }
        }

        return best
    }
}