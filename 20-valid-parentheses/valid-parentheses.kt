class Solution {
    fun isValid(s: String): Boolean {
        val n = s.length

        // Valid string is always even length. `n and 1` = n % 2.
        if (n and 1 == 1) return false

        // Primitive stack: raw chars, no boxing.
        val stack = CharArray(n)
        var top = 0  // stack size = next free slot

        for (i in 0 until n) {
            when (val c = s[i]) {
                // Push the expected closer, so popping is one char compare.
                '(' -> stack[top++] = ')'
                '{' -> stack[top++] = '}'
                '[' -> stack[top++] = ']'

                // top == 0: closer with nothing open, ")(".
                // stack[--top] pops; mismatch means crossed, "([)]".
                else -> if (top == 0 || stack[--top] != c) return false
            }
        }

        return top == 0  // leftovers mean unclosed, "(((".
    }
}