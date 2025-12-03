class Solution {
    fun pivotIndex(nums: IntArray): Int {
        var totalLeftPivot = nums[0]
        var totalRightPivot = nums.sum()

        if (totalLeftPivot == totalRightPivot) {
            return 0
        }

        for (i in 1 until nums.size) {
            totalLeftPivot += nums[i]
            totalRightPivot -= nums[i - 1]

            if (totalLeftPivot == totalRightPivot) {
                return i
            }
        }

        return -1
    }
}