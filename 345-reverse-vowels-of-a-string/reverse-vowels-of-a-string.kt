class Solution {
    fun reverseVowels(s: String): String {
        if (s.length < 2) return s

        val vowels = setOf('a', 'i', 'u', 'e', 'o', 'A', 'I', 'U', 'E', 'O')
        var left = 0
        var right = s.length - 1
        val sArray = s.toCharArray()

        while (left < right) {
            if (!vowels.contains(sArray[left])) {
                left++
            } else if (!vowels.contains(sArray[right])) {
                right--
            } else {
                val temp = sArray[left]
                sArray[left] = sArray[right]
                sArray[right] = temp
                left++
                right--
            }
        }

        return String(sArray)
    }
}