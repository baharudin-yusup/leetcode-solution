class Solution {
    fun isPalindrome(x: Int): Boolean {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false
        }

        var tempX = x
        var reverseX = 0

        // 102 ==> 1*10^2 + 0*10^1 + 2*10^0
        // 2 == 0*10 + 102%10
        // 20 == 2*10 + 10%10
        // 201 == 20*10 + 1%10
        while (tempX > 0) {
            reverseX *= 10
            reverseX += tempX % 10
            tempX = tempX / 10
        }

        return x == reverseX
    }
}