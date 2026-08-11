class Solution {
    fun intToRoman(numInput: Int): String {
        var romanNumber = ""
        var num = numInput
        while (num > 0) {
            if (num >= 1000) {
                romanNumber += "M"
                num -= 1000
            } else if (num >= 500) {
                if (num >= 900) {
                    romanNumber += "CM"
                    num -= 900
                } else {
                    romanNumber += "D"
                    num -= 500
                }
            } else if (num >= 100) {
                if (num >= 400) {
                    romanNumber += "CD"
                    num -= 400
                } else {
                    romanNumber += "C"
                    num -= 100
                }
            } else if (num >= 50) {
                if (num >= 90) {
                    romanNumber += "XC"
                    num -= 90
                } else {
                    romanNumber += "L"
                    num -= 50
                }
            } else if (num >= 10) {
                if (num >= 40) {
                    romanNumber += "XL"
                    num -= 40
                } else {
                    romanNumber += "X"
                    num -= 10
                }
            } else if (num >= 5) {
                if (num >= 9) {
                    romanNumber += "IX"
                    num -= 9
                } else {
                    romanNumber += "V"
                    num -= 5
                }
            } else {
                if (num >= 4) {
                    romanNumber += "IV"
                    num -= 4
                } else {
                    romanNumber += "I"
                    num -= 1
                }
            }
        }

        return romanNumber
    }
}