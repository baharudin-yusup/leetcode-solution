class Solution {
    private val memo = mutableMapOf<Int, Int>()

    fun tribonacci(n: Int): Int {
        when (n) {
            0 -> {
                return 0
            }
            1, 2 -> {
                return 1
            }
            else -> {
                val memoizeValue = memo[n]

                if (memoizeValue != null) {
                    return memoizeValue
                }

                val result = tribonacci(n - 3) + tribonacci(n - 2) + tribonacci(n - 1)
                memo[n] = result

                return result
            }
        }
    }
}