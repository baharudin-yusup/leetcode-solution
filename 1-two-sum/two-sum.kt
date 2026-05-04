class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        // Current num -> index
        val numberMap = hashMapOf<Int, Int>()

        nums.forEachIndexed { index, num ->
            val requiredNumIndex = numberMap[target - num]
            
            if (requiredNumIndex != null) {
                return intArrayOf(index, requiredNumIndex)
            }

            numberMap[num] = index
        }

        return intArrayOf()
    }
}