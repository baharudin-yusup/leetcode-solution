class Solution {
    fun convert(s: String, numRows: Int): String {
        if (numRows == 1 || s.length == numRows) {
            return s
        }

        val rows = Array(numRows) { StringBuilder() }
        var isDown = true
        var current = 0

        for (char in s) {
            rows[current].append(char)

            if (isDown) {
                current++
            } else {
                current--
            }

            if (current == numRows) {
                isDown = false
                current = numRows - 2
            } else if (current == -1) {
                isDown = true
                current = 1
            }
        }

        return rows.joinToString("")
    }
}

// (P)((A))(((Y)))((((P))))(((A)))((L))(I)((S))(((H)))((((I))))(((R)))((I))(N)((G))
// PINALSIGYAHRPI
// PINALSIGYAHRPI
