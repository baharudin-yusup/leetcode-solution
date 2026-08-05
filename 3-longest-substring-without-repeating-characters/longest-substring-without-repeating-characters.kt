class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        if (s.isEmpty()) {
            return 0
        }

        var longestSubstring = 0
        
        for (i in 0..<s.length) {
            val charMap = mutableMapOf<Char, Boolean>()
            val currentString = s.substring(i)
            var currentTotal = 0
            for (c in currentString) {
                if (charMap[c] == null) {
                    charMap[c] = true
                    currentTotal++
                } else {
                    break
                }
            }

            if (currentTotal > longestSubstring) {
                longestSubstring = currentTotal
            }
        }
        
        return longestSubstring
    }
}