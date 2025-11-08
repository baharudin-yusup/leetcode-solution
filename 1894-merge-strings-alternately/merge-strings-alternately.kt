class Solution {
    fun mergeAlternately(word1: String, word2: String): String {
        var i = 0
        var j = 0
        val word1Length = word1.length
        val word2Length = word2.length

        val charArr = CharArray(word1Length + word2Length) { currentIndex ->
            when {
                i < word1Length && j < word2Length -> {
                    if (currentIndex % 2 == 0) {
                        val currentChar = word1[i]
                        i++
                        currentChar
                    } else {
                        val currentChar = word2[j]
                        j++
                        currentChar
                    }
                }
                i < word1Length -> {
                    val currentChar = word1[i]
                    i++
                    currentChar
                }
                else -> {
                    val currentChar = word2[j]
                    j++
                    currentChar
                }
            }
        }

        return String(charArr)
    }
}