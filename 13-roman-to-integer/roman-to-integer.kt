class Solution {
    fun romanToInt(s: String): Int {
        var number = 0
        val romanNumber = mapOf(
            "I" to 1,
            "IV" to 4,
            "V" to 5,
            "IX" to 9,
            "X" to 10,
            "XL" to 40,
            "L" to 50,
            "XC" to 90,
            "C" to 100,
            "CD" to 400,
            "D" to 500,
            "CM" to 900,
            "M" to 1000,
        )

        var currentIndex = 0
        val maxIndex = s.length - 1
        while (currentIndex <= maxIndex) {
            // println("---")
            if (currentIndex + 1 <= maxIndex) {
                // 900
                // 0 1
                // C M
                // [0, 2 (Exclusive)] --> CM
                // Next Index = 2 --> currentIndex (0) + 2
                val selectedNumber = romanNumber.getOrDefault(s.substring(currentIndex, currentIndex + 2), 0)
                // println(">>> ${s.substring(currentIndex, currentIndex + 2)}")
                if (selectedNumber > 0) {
                    // println("selectedNumber: ${s.substring(currentIndex, currentIndex + 2)}")
                    number += selectedNumber
                    currentIndex += 2
                    // println("currentNumber: ${number}")
                    if (currentIndex > maxIndex) {
                        // println("final result: ${number}")
                        return number
                    }

                    continue
                }
            }
            // println("currentIndex: ${currentIndex}")
            val selectedNumber = romanNumber.getOrDefault(s.substring(currentIndex, currentIndex + 1), 0)
            // println(">>> ${s.substring(currentIndex, currentIndex + 1)}")
            // println("selectedNumber: ${s.substring(currentIndex, currentIndex + 1)}")
            number += selectedNumber
            // println("currentNumber: ${number}")
            currentIndex += 1

            if (currentIndex > maxIndex) {
                // println("final result: ${number}")
                return number
            }
        }

        // println("final result: ${number}")
        return number
    }
}