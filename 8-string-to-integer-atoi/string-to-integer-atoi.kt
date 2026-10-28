class Solution {
    fun myAtoi(s: String): Int {
        if (s.length == 0) return 0
        val sb = StringBuilder()

        for (c in s) {
            if (!isValidChar(c)) {
                return sbToInt(sb)
            } else if (c == '+' || c == '-') {
                // println("sb.length: ${sb.length}")
                if (sb.length >= 1) {
                    return sbToInt(sb)
                } else {
                    sb.append(c)
                }
            } else if (c == ' ' && sb.length > 0) {
                return sbToInt(sb)
            } else if (c != '.' && c != ' ') {
                sb.append(c)
            }

            // println(sb)
        }

        return sbToInt(sb)
    }

    private fun sbToInt(sb: StringBuilder): Int {
        // print("sb: ${sb}")
        if (sb.length == 0) return 0
        val prefixMultiplier = if (sb[0] == '-') {
            sb.deleteAt(0)
            -1
        } else if (sb[0] == '+') {
            sb.deleteAt(0)
            1
        } else {
            1
        }
 
        if (sb.length == 0) return 0
        val firstNonZeroIndex = sb.indexOfFirst { it != '0' }

        if (firstNonZeroIndex == -1) {
            return 0
        } else if (firstNonZeroIndex > 0) {
            sb.delete(0, firstNonZeroIndex)
        }

        var number = 0L

        // 231 -> 2 (0+2), 23 (prev*10 + 3), 231
        // 200 + 30 + 1


        for (i in sb.indices) {
            // println("current number: ${number}")
            val c = if (sb[i] == '0') {
                0L
            } else if (sb[i] == '1') {
                1L
            } else if (sb[i] == '2') {
                2L
            } else if (sb[i] == '3') {
                3L
            } else if (sb[i] == '4') {
                4L
            } else if (sb[i] == '5') {
                5L
            } else if (sb[i] == '6') {
                6L
            } else if (sb[i] == '7') {
                7L
            } else if (sb[i] == '8') {
                8L
            } else {
                9L
            }
            val newNumber = number * 10L + c
            

            // println("current number: ${number}")
            // println(">> new number: ${newNumber}")
            if (prefixMultiplier < 0 && newNumber * -1L <= Int.MIN_VALUE) {
                return Int.MIN_VALUE
            } else if (prefixMultiplier > 0 && newNumber >= Int.MAX_VALUE) {    
                return Int.MAX_VALUE
            } else {
                number = newNumber
            }
        }

        return number.toInt() * prefixMultiplier
    }

    private fun isValidChar(c: Char) =
        c == '0' ||
        c == '1' ||
        c == '2' ||
        c == '3' ||
        c == '4' ||
        c == '5' ||
        c == '6' ||
        c == '7' ||
        c == '8' ||
        c == '9' ||
        c == ' ' ||
        c == '-' ||
        c == '+'
}