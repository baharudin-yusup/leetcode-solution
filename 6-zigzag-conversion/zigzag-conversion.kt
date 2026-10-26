class Solution {
    fun convert(s: String, numRows: Int): String {
        if (numRows == 1 || s.length <= numRows) return s

        val rows = Array(numRows) { StringBuilder() }
        var current = 0
        var isDown = false

        for (char in s) {
            rows[current].append(char)
            if (current == 0 || current == numRows - 1) isDown = !isDown
            current += if (isDown) 1 else -1
        }

        return rows.joinToString("")
    }
}