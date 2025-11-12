class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        var left = 0
        for (right in 0 until nums.size) {
            if (nums[right] != 0) {
                val temp = nums[left]
                nums[left] = nums[right]
                nums[right] = temp
                left++
            }
        }
    }
}