class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        if (nums.size == 0) {
            return 0
        }

        var left = 0
        var right = nums.size - 1

        while (left <= right) {
            val mid = (left + right) ushr 1

            if (nums[mid] == target) {
                return mid
            }

            if (target < nums[mid]) {
                right = mid - 1
            } else {
                left = mid + 1
            }
        }

        return left
    }
}