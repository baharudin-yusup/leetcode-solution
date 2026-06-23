class Solution {
    fun compress(chars: CharArray): Int {
        var output = ""

        var currentChar = chars[0]
        var total = 1

        if (chars.size == 1) {
            return 1
        }

        val lastIndex = chars.size - 1
        for (i in 1..lastIndex) {
            val newChar = chars[i]

            if (i == lastIndex) {
                if (newChar != currentChar) {
                    // Print the previous value and then add the new char
                    output += combineChar(currentChar, total)
                    output += newChar
                } else {
                    output += combineChar(currentChar, ++total)
                }
            } else {
                if (newChar != currentChar) {
                    output += combineChar(currentChar, total)
                    total = 1
                    currentChar = newChar
                } else {
                    total++
                }
            }
        }


        println(output)
        val outputLength = output.length
        for (i in 0..<outputLength) {
           chars[i] = output[i]
        }

        return outputLength
    }

    private fun combineChar(c: Char, total: Int): String {
        if (total > 1) {
            return "$c$total"
        } else {
            return c.toString()
        }
    }
}