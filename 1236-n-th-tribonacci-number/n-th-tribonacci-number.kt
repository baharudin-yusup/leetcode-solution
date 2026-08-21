class Solution {
    fun tribonacci(n: Int): Int {
        var a = 0 // n-3
        var b = 1 // n-2
        var c = 1 // n-1

        if (n == 0) {
            return 0
        }

        if (n < 3) {
            return 1
        }

        for (i in 3..n) {
            val newC = a + b + c
            a = b
            b = c
            c = newC
        }

        // Return the newC (newC (n) --> a + b + c --> n-3 + n-2 + n-1)
        return c
    }
}