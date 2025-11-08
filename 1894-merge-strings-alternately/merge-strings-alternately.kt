class Solution {
    fun mergeAlternately(word1: String, word2: String): String {
        val word1Length = word1.length
        val word2Length = word2.length

        val sb = StringBuilder()

        for (i in 0 until max(word1Length, word2Length)) {
            if (i < word1Length) {
                sb.append(word1[i])
            }

            if (i < word2Length) {
                sb.append(word2[i])
            }
        }

        return String(sb)
    }
}