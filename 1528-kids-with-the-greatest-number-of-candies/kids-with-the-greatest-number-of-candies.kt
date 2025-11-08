class Solution {
    fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
        val threshold = (candies.maxOrNull() ?: 0) - extraCandies

        return List<Boolean>(candies.size) { candies[it] >= threshold }
    }
}