
function closeStrings(word1: string, word2: string): boolean {
    if (word1.length != word2.length) {
        return false;
    }

    if (word1 === word2) {
        return true;
    }

    const w1Array = new Array(26).fill(0);
    const w2Array = new Array(26).fill(0);


    for (let i = 0; i < word1.length; i++) {
        w1Array[word1.charCodeAt(i) - 97]++;
        w2Array[word2.charCodeAt(i) - 97]++;
    }

    for (let i = 0; i < 26; i++) {
        if ((!w1Array[i] && w2Array[i]) || (w1Array[i] && !w2Array[i])) {
            return false;
        }
    }

    w1Array.sort();
    w2Array.sort();

    for (let i = 0; i < 26; i++) {
        if (w1Array[i] != w2Array[i]) {
            return false;
        }
    }

    return true;
};