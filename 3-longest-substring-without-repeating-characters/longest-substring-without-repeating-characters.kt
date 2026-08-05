class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        if (s.isEmpty()) {
            return 0
        }

        var maxLength = 0

        var leftPointer = 0
        val charMap = mutableMapOf<Char, Int>()

        for ((i, char) in s.withIndex()) {
            val currentCharIndex = charMap[char]
            charMap[char] = i

            // println(">>> [${i}] Current char = ${char} | currentCharIndex = ${currentCharIndex}")
            if (currentCharIndex != null && currentCharIndex + 1 > leftPointer) {
                leftPointer = currentCharIndex + 1
                // println(">>> Change left pointer to = ${leftPointer}")
            }

            // println(">>> Current left pointer = ${leftPointer} | current righ pointer = ${i}")

            val currentLength = i - leftPointer + 1
            if (currentLength > maxLength) {
                maxLength = currentLength
                // println("${s.substring(leftPointer, i + 1)} | length = ${s.substring(leftPointer, i + 1).length} | max-length = ${maxLength}")
            }
        }

        return maxLength
    }
}