class Solution {
    private val Char.isVowel
        get() = this == 'a' || this == 'e' || this == 'i' || this == 'o' || this == 'u'

    fun maxVowels(s: String, k: Int): Int {
        var currentTotalVowel = 0
        for (i in 0 until k) {
            if (s[i].isVowel) {
                currentTotalVowel++
            }
        }

        if (k == s.length) {
            return currentTotalVowel
        }

        var maxTotalVowel = currentTotalVowel

        for (i in k until s.length) {
            val prevCounter = if (s[i - k].isVowel) -1 else 0
            var nextCounter = if (s[i].isVowel) 1 else 0
            currentTotalVowel += prevCounter + nextCounter
            maxTotalVowel = max(maxTotalVowel, currentTotalVowel)
        }

        return maxTotalVowel
    }
}