class Solution {
    fun minCostClimbingStairs(cost: IntArray): Int {
        val lastStair = cost.size
        for (i in cost.size - 1 downTo 0) {
            val oneStep = if (i + 1 < lastStair) cost[i + 1] else 0
            val twoStep = if (i + 2 < lastStair) cost[i + 2] else 0
            cost[i] = cost[i] + minOf(oneStep, twoStep)
        }
        return minOf(cost[0], cost[1])
    }
}