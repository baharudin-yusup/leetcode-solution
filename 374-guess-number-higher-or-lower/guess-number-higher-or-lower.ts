/** 
 * Forward declaration of guess API.
 * @param {number} num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * var guess = function(num) {}
 */


function guessNumber(n: number): number {
    let low = 1;
    let high = n;
    
    while (true) {
        const mid = (low + high) / 2
        const result = guess(mid);

        if (result == 0) {
            return mid;
        } 
        // Too low
        else if (result > 0) {
            low = mid;
        }
        // Too high
        else {
            high = mid;
        }
    }
};