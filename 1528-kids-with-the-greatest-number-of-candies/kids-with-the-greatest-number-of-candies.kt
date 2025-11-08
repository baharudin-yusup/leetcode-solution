class Solution {
    fun kidsWithCandies(candies: IntArray, extraCandies: Int): BooleanArray {
        val threshold = (candies.maxOrNull() ?: 0) - extraCandies

        val output = BooleanArray(candies.size)

        for (i in 0 until candies.size) {
            output[i] = candies[i] >= threshold
        }

        return output
    }
}