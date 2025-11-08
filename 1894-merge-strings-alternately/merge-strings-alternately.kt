class Solution {
    fun mergeAlternately(word1: String, word2: String): String {
        val word1Length = word1.length
        val word2Length = word2.length
        var i = 0
        val sb = StringBuilder()

        while (i < min(word1Length, word2Length)) {
            sb.append(word1[i])
            sb.append(word2[i])
            i++
        }

        while (i < word1Length) {
            sb.append(word1[i])
            i++
        }

        while (i < word2Length) {
            sb.append(word2[i])
            i++
        } 

        return String(sb)
    }
}