// dpLeft[i] = product of nums[0]...nums[i-2]...nums[i-1]
// dpLeft[i-1] = product of nums[0]...nums[i-2]
// dpLeft[i] = dpLeft[i-1] . nums[i-1]
const dpLeft = [];
// dpRight[i] = product of nums[i+1]...nums[1+2]...nums[n]
// dpRight[i+1] = product of nums[i+2]...nums[n]
// dpRight[i] = nums[i+1] . dpRight[i+1]
const dpRight = [];

function productExceptSelf(nums: number[]): number[] {

    // Calculate dpLeft
    for (let i = 0; i < nums.length; i++) {
        dpLeft[i] = calculateDpLeft(i, nums);
    }

    // Calculate dpRight
    for (let j = nums.length - 1; j >= 0; j--) {
        dpRight[j] = calculateDpRight(j, nums);
    }

    return nums.map((_num, idx) => {
        return dpLeft[idx] * dpRight[idx];
    });
};

function calculateDpLeft(i: number, nums: number[]): number {
    if (i == 0) {
        return 1;
    }

    return dpLeft[i - 1] * nums[i - 1];
}

function calculateDpRight(i: number, nums: number[]): number {
    if (i == nums.length - 1) {
        return 1;
    }

    return nums[i + 1] * dpRight[i + 1];
}