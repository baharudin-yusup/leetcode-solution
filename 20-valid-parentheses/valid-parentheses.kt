class Solution {
    fun isValid(s: String): Boolean {
        val stack = ArrayDeque<Char>()

        for (char in s) {
            // println(">>> currentChar: ${char}")
            when (char) {
                '(', '{', '[' -> {
                    // println("Add to stack")
                    stack.addLast(char)
                    // println("new stack: ${stack}")
                }
                else -> {
                    val correctOpeningBracket = if (char == ')') '('
                        else if (char == '}') '{' else '['
                    // println("correctOpeningBracket: ${correctOpeningBracket}")
                    val last = stack.lastOrNull() ?: return false
                    if (last == correctOpeningBracket) {
                        stack.removeLastOrNull()
                    } else {
                        return false
                    }
                }
            }
        }

        return stack.size == 0
    }
}