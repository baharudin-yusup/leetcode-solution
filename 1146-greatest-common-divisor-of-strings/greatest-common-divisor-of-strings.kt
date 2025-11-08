class Solution {
    fun gcdOfStrings(str1: String, str2: String): String {
    // Jika penggabungan beda, artinya tidak ada pembagi string
    if (str1 + str2 != str2 + str1) return ""

    // Hitung GCD dari panjang string
    fun gcd(a: Int, b: Int): Int {
        return if (b == 0) a else gcd(b, a % b)
    }

    val gcdLength = gcd(str1.length, str2.length)
    return str1.substring(0, gcdLength)
    }
}