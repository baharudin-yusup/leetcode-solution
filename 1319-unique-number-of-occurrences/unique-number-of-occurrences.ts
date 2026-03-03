function uniqueOccurrences(arr: number[]): boolean {
    const numberMap: Record<number, number> = {};

    arr.forEach((n) => {
        numberMap[n] = (numberMap[n] ?? 0) + 1;
    });

    const uniqueMap: Record<number, boolean> = {};
    for (const [key, value] of Object.entries(numberMap)) {
        if (uniqueMap[value]) {
            return false
        }

        uniqueMap[value] = true
    }

    return true;
};