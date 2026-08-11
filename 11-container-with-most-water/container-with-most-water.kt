class Solution {
    fun maxArea(height: IntArray): Int {
        var leftPointer = 0
        var rightPointer = height.size - 1
        var highestArea = 0
        while (leftPointer < rightPointer) {
            val leftHeight = height[leftPointer]
            val rightHeight = height[rightPointer]
            val area = (rightPointer - leftPointer) * (min(leftHeight, rightHeight))

            if (area > highestArea) {
                highestArea = area
            }

            if (leftHeight > rightHeight) {
                rightPointer--
            } else {
                leftPointer++
            }
        }

        return highestArea
    }
}