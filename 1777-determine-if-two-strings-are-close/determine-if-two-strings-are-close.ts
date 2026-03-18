const areSetsEqual = <T>(setA: Set<T>, setB: Set<T>): boolean => {
  // First, check if the sizes are the same. If not, they are not equal.
  if (setA.size !== setB.size) {
    return false;
  }

  // Iterate over the elements of the first set
  for (const value of setA) {
    // Check if the second set has every value from the first set
    if (!setB.has(value)) {
      return false;
    }
  }

  // If all elements match and sizes are equal, the sets are equal
  return true;
};

function closeStrings(word1: string, word2: string): boolean {
    if (word1.length != word2.length) {
        return false;
    }

    let word1Set = new Set(word1);
    let word2Set = new Set(word2);

    if (!(areSetsEqual(word1Set, word2Set))) {
        return false;
    }

    // {a: 3, b: 5, c: 3, ...}
    let word1Map = new Map<string, number>();
    let word2Map = new Map<string, number>();

    
    for (let i = 0; i < word1.length; i++) {
        const w1 = word1[i];
        const w2 = word2[i];
        word1Map.set(w1, (word1Map.get(w1) ?? 0) + 1);
        word2Map.set(w2, (word2Map.get(w2) ?? 0) + 1);
    }

    // {1: 2, 4: 2, 3: 2, ...}
    let word1MapLength = new Map<number, number>();
    let word2MapLength = new Map<number, number>();

    word1Map.forEach((value, _) => {
        const prevValue = word1MapLength.get(value) ?? 0;
        word1MapLength.set(value, prevValue + 1);
    });

    word2Map.forEach((value, _) => {
        word2MapLength.set(value, (word2MapLength.get(value) ?? 0) + 1);
    });

    for (const [key, value] of word1MapLength) {
        if (value != word2MapLength.get(key)) {
            return false;
        }
    }

    return true;
};