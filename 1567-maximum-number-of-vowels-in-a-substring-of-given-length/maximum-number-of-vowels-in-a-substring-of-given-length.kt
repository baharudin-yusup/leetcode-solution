class Solution {
    // s = "leetcode", k=3
    fun maxVowels(s: String, k: Int): Int {
        var curr = 0
        var max = 0

        // Initial value
        // 'l', 'e', 'e'
        for (i in 0 until k) {
            if (s[i].isVowel()) curr++
        }
        
        // curr = 2
        // max = 2
        max = curr
        //  0    1    2    3    4    5    6    7
        // 'l', 'e', 'e', 't', 'c', 'o', 'd', 'e'
        // 't', 'c', 'o', 'd', 'e'
        // i = 3, 4, 5, 6, 7 (i == last char in this window)
        for (i in k until s.length) {
            if (s[i - k].isVowel()) curr--
            if (s[i].isVowel()) curr++
            max = maxOf(curr, max)
        }

        return max
    }

    private val vowels = setOf('a', 'i', 'u', 'e', 'o')
    private fun Char.isVowel() = vowels.contains(this)
}