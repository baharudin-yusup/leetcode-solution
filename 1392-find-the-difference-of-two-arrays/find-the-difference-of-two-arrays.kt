class Solution {
    fun findDifference(nums1: IntArray, nums2: IntArray): List<List<Int>> {
        val map1 = nums1.associate { it to true }.toMutableMap()
        val map2 = nums2.associate { it to true }.toMutableMap()

        nums1.forEach { num ->
            map2[num] = false
        }

        nums2.forEach { num ->
            map1[num] = false
        }

        val distinct1 = map1
            .filterValues { it }
            .keys
            .toList()
        val distinct2 = map2
            .filterValues { it }
            .keys
            .toList()
        
        return listOf(distinct1, distinct2)
    }
}