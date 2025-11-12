class Solution {
    fun isSubsequence(s: String, t: String): Boolean {
        if (s.length == 0) return true
        if (t.length == 0) return false
        if (s.length > t.length) return false
        val sArray = s.toCharArray()
        val tArray = t.toCharArray()

        var currentSCharIndex = 0
        for (i in 0 until tArray.size) {
            if (tArray[i] == sArray[currentSCharIndex]) {
                currentSCharIndex++
                if (currentSCharIndex == sArray.size) return true
            }
        }

        return false
    }
}