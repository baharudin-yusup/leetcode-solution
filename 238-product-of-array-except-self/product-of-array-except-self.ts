function productExceptSelf(nums: number[]): number[] {
    const answer = [];
    
    // Calculate left product
    // [2, 0, 7, 4, 6]
    // 0 = 1 * 1 = 1
    // 1 = 2 * 1 = 2
    // 2 = 0 * 2 = 0
    // 3 = 7 * 0 = 0
    let leftProduct = 1;
    for (let i = 0; i < nums.length; i++) {
        answer[i] = leftProduct;
        leftProduct *= nums[i];
    }

    // Calculate right product
    // [2, 0, 7, 4, 6]
    // 4 = 1 * 1 = 1
    // 3 = 6 * 1 = 2
    // 2 = 4 * 2 = 0
    // 1 = 7 * 0 = 0
    let rightProduct = 1;
    for (let j = nums.length - 1; j >= 0; j--) {
        answer[j] *= rightProduct;
        rightProduct *= nums[j];
    }

    return answer;
};