function isPalindrome(x: number): boolean {
    if (x < 0) {
        return false;
    }

    let xString = x + "";
    let maxIndex = xString.length - 1

    for (let i = 0; i < xString.length; i++) {
        if (xString[i] !== xString[maxIndex - i]) {
            return false;
        }
    }

    return true;
};