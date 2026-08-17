class Solution {
    fun maxOperations(nums: IntArray, k: Int): Int {
        val mapNumber = mutableMapOf<Int, Int>()

        nums.forEach {
            mapNumber[it] = (mapNumber[it] ?: 0) + 1
        }

        var maxOp = 0

        for ((num, totalNum) in mapNumber) {
            val pairNum = k - num

            if (num == pairNum) {
                val totalPair: Int = totalNum / 2
                mapNumber[num] = (mapNumber[num] ?: 0) - totalPair
                maxOp += totalPair
                continue
            } else if (mapNumber[pairNum] == null) {
                continue
            }
            
            val totalPairNum = mapNumber[pairNum] ?: 0
            if (totalNum > 0 && totalPairNum > 0) {
                val leastTotalPairNum = minOf(totalNum, totalPairNum)
                mapNumber[pairNum] = (mapNumber[pairNum] ?: 0) - leastTotalPairNum
                mapNumber[num] = (mapNumber[num] ?: 0) - leastTotalPairNum
                maxOp += leastTotalPairNum
            }
        }

        return maxOp
    }
}