function findDifference(nums1: number[], nums2: number[]): number[][] {
    // Creating two Sets for both Array of numbers.
    const [ansSet1, ansSet2] = [new Set(nums1), new Set(nums2)];
    
    return [
        // Filtering the first Set by occurences in the second Set via delete
        // we get a filtered Set for the second answer-item.
        [...ansSet1].filter(n => !ansSet2.delete(n)),
        [...ansSet2]
    ];
};