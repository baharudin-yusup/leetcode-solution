class Solution {
    private fun isVowel(c: Char): Boolean {
        return when(c) {
            'a', 'i', 'u', 'e', 'o' -> true
            else -> false
        }
    }

    fun maxVowels(s: String, k: Int): Int {
        var currentTotalVowel = 0
        for (i in 0 until k) {
            if (isVowel(s[i])) {
                currentTotalVowel++
            }
        }

        if (k == s.length) {
            return currentTotalVowel
        }

        var maxTotalVowel = currentTotalVowel

        for (i in k until s.length) {
            val prevCounter = if (isVowel(s[i - k])) -1 else 0
            var nextCounter = if (isVowel(s[i])) 1 else 0
            currentTotalVowel += prevCounter + nextCounter
            maxTotalVowel = max(maxTotalVowel, currentTotalVowel)
        }

        return maxTotalVowel
    }
}