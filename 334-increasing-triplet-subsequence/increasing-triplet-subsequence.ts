function increasingTriplet(nums: number[]): boolean {
    if (nums.length < 3) {
        return false
    }

    let left = Number.MAX_SAFE_INTEGER;
    let mid = Number.MAX_SAFE_INTEGER;

    for (let i = 0; i < nums.length; i++) {
        const num = nums[i];

        if (num <= left) {
            left = num;
            continue;
        }

        if (num <= mid) {
            mid = num;
            continue;
        }

        return true;
    }

    return false;
};