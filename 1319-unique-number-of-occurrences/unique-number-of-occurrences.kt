class Solution {
    fun uniqueOccurrences(arr: IntArray): Boolean {
        val map = hashMapOf<Int, Int>()
        arr.forEach {
            map[it] = (map[it] ?: 0) + 1
        }

        val set = hashSetOf<Int>()
        map.values.forEach {
            if (set.contains(it)) {
                return false
            } else {
                set.add(it)
            }
        }
        
        return true
    }
}