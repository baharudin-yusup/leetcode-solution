class Solution {
    fun missingInteger(nums: IntArray): Int {
        val size = nums.size
        val exists = BooleanArray(1277) { false }
        exists[nums[0]] = true

        var prefixSum = nums[0]

        var iter = 1
        while(iter < size && nums[iter] - nums[iter - 1] == 1) { 
            exists[nums[iter]] = true
            prefixSum += nums[iter++]
        }
        for(i in iter..<size) exists[nums[i]] = true

        while(exists[prefixSum]) prefixSum++

        return prefixSum

    }
}