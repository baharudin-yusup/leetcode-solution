class Solution {
    fun isPalindrome(x: Int): Boolean {
        if (x < 0) {
            return false
        }

        var tempX = x
        var reverseX = 0
        // 102 ==> 1x10^2 + 0x10^1 + 2x10^0
        // 2 == 102 % 10 == 10x10 + 2
        // 20
        // 201
        // 201 ==> 2x10^2 + 0x10^1 + 1x10^0

        while (tempX > 0) {
            reverseX *= 10
            reverseX += tempX % 10
            tempX = tempX / 10
        }

        return x == reverseX
    }
}