class Solution {
    fun maxOperations(nums: IntArray, k: Int): Int {
        nums.sort()

        var leftIndex = 0
        var rightIndex = nums.lastIndex
        var maxOp = 0

        while (leftIndex < rightIndex) {
            val sum = nums[leftIndex] + nums[rightIndex]

            when {
                // Match
                sum == k -> {
                    maxOp++
                    leftIndex++
                    rightIndex--
                }

                // Decrease the sum
                sum > k -> {
                    rightIndex--
                }

                // Increase the sum
                sum < k -> {
                    leftIndex++
                }
            }
        }

        return maxOp
    }
}