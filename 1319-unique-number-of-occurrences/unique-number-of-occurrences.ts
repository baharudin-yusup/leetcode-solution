function uniqueOccurrences(arr: number[]): boolean {
    const numberMap: Record<number, number> = {};

    arr.forEach((n) => {
        numberMap[n] = (numberMap[n] ?? 0) + 1;
    });

    const numberSet = new Set<number>();
    Object.entries(numberMap).forEach(([key, value]) => {
        numberSet.add(value)
    });

    return numberSet.size == Object.keys(numberMap).length;
};