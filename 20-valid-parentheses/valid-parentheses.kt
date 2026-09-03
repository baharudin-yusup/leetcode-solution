class Solution {
    fun isValid(s: String): Boolean {
        val pairs = mapOf(')' to '(', '}' to '{', ']' to '[')
        val stack = ArrayDeque<Char>()

        for (char in s) {
            when (char) {
                '(', '{', '[' -> stack.addLast(char)
                else -> if (stack.removeLastOrNull() != pairs[char]) return false
            }
        }

        return stack.isEmpty()
    }
}