class Solution {
    fun isVowel(c: Char): Boolean {
        return when (c) {
            'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> true
            else -> false
        }
    }

    fun reverseVowels(s: String): String {
        if (s.length < 2) return s

        var left = 0
        var right = s.length - 1
        val sArray = s.toCharArray()

        while (left < right) {
            val leftChar = sArray[left]
            val rightChar = sArray[right]
            if (!isVowel(leftChar)) {
                left++
            } else if (!isVowel(rightChar)) {
                right--
            } else {
                sArray[left] = rightChar
                sArray[right] = leftChar
                left++
                right--
            }
        }

        return String(sArray)
    }
}